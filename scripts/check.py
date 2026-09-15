"""Compile the Java sources and check real console output. Python 3 + JDK 17+."""
from pathlib import Path
import subprocess

ROOT = Path(__file__).resolve().parents[1]
OUT = ROOT / "out"
OUT.mkdir(exist_ok=True)
sources = sorted((ROOT / "src").rglob("*.java"))
sources += sorted((ROOT / "test").rglob("*.java"))
subprocess.run(["javac", "--release", "17", "-encoding", "UTF-8",
                "-Xlint:all", "-d", str(OUT), *map(str, sources)], check=True)
checks = []


def run(name, data="", args=()):
    completed = subprocess.run(
        ["java", "-Dfile.encoding=UTF-8", "-cp", str(OUT), "practice1." + name,
         *args], input=data, text=True, encoding="utf-8", capture_output=True,
        timeout=10, check=True)
    assert not completed.stderr, completed.stderr
    return completed.stdout


def check(label, name, data, fragments, args=()):
    output = run(name, data, args)
    for fragment in fragments:
        assert fragment in output, (label, fragment, output)
    checks.append(label)


check("Массив с инициализацией", "Task03ArrayFor", "",
      ["Сумма: 22", "Среднее арифметическое: 4.40"])
for label, values in [
    ("Смешанные значения", [3, -2, 7, 0, 14]),
    ("Один элемент", [-9]),
    ("Отрицательные значения", [-8, -3, -10]),
    ("Нулевые значения", [0, 0, 0]),
    ("Равные значения", [5, 5, 5]),
    ("Сумма больше int", [2147483647, 2147483647]),
    ("Границы int", [-2147483648, 2147483647]),
]:
    data = str(len(values)) + "\n" + " ".join(map(str, values)) + "\n"
    check(label, "Task04ArrayInput", data,
          [f"Сумма (do while): {sum(values)}", f"Сумма (while): {sum(values)}",
           f"Минимум: {min(values)}", f"Максимум: {max(values)}"])
for label, data in [
    ("Нулевой размер", "0\n"), ("Отрицательный размер", "-2\n"),
    ("Нечисловой размер", "abc\n"), ("Нечисловой элемент", "2\n1 x\n"),
    ("Не хватает элементов", "2\n1\n"),
    ("Элемент за границей int", "1\n2147483648\n"),
    ("Пустой ввод массива", ""),
]:
    check(label, "Task04ArrayInput", data, ["Ошибка:"])
check("Аргументы со строкой и пробелом", "Task05CommandLine", "",
      ["args[0] = Java", "args[1] = 123", "args[2] = Привет мир"],
      ("Java", "123", "Привет мир"))
check("Без аргументов", "Task05CommandLine", "", ["не переданы"])
check("Пустой аргумент", "Task05CommandLine", "", ["args[0] = \n"], ("",))
harmonic = run("Task06HarmonicSeries").splitlines()[1:]
assert len(harmonic) == 10
for n, line in enumerate(harmonic, 1):
    columns = [part.strip() for part in line.split("|")]
    assert columns == [str(n), f"1/{n}", f"{1 / n:.6f}"], line
checks.append("Все 10 членов гармонического ряда и формат")
check("Метод factorial: 8 проверок", "FactorialTest", "", ["Пройдено 8"])
for n, expected in [(0, 1), (5, 120), (20, 2432902008176640000)]:
    check(f"Ввод факториала {n}", "Task07Factorial", f"{n}\n",
          [f"{n}! = {expected}"])
for label, data in [("Отрицательный факториал", "-1\n"),
                    ("Переполнение факториала", "21\n"),
                    ("Нечисловой факториал", "abc\n"),
                    ("Пустой ввод факториала", "")]:
    check(label, "Task07Factorial", data, ["Ошибка:"])
for label in checks:
    print("PASS: " + label)
print(f"Всего пройдено сценариев: {len(checks)}.")
