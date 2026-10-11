# Практические работы по Java

Работы 1 и 2 выполнены полностью. В работе 3: Math/Random № 1, 3, 4; все задания на оболочки; форматирование № 1. В работе 4 выбрано задание 1, в работе 6 — задание 11. В работе 7 выполнены все программные задания и UML.

## Запуск

Откройте папку `java-practices` в IntelliJ IDEA, выберите установленный JDK 17 или новее и нужную конфигурацию запуска в верхней панели. Нажмите Run. Вводимые значения вводятся по одному в ответ на подсказки консоли.

Для запуска без IDE из корня проекта:

```sh
javac --release 17 -encoding UTF-8 -d out @sources.txt
java -cp out practice2.task01.TestAuthor
```

В последней команде замените имя класса на нужное из таблицы.

## Работа 1

Готовые классы `Task03ArrayFor`–`Task07Factorial` находятся в `src/practice1`. Проверка метода факториала — `test/practice1/FactorialTest.java`.

## Работа 2

| Задание | Запускаемый класс |
|---|---|
| 01. Автор | `practice2.task01.TestAuthor` |
| 02. Мяч | `practice2.task02.TestBall` |
| 03. Точки и окружности | `practice2.task03.Tester` |
| 04. Магазин компьютеров | `practice2.task04.TestShop` |
| 05. Питомник собак | `practice2.task05.ПитомникСобак` |
| 06. Площадь и длина окружности | `practice2.task06.CircleTest` |
| 07. Книжная полка | `practice2.task07.BookTest` |
| 08. Разворот массива | `practice2.task08.ReverseArray` |
| 09. Покер | `practice2.task09.Poker` |
| 10. Количество слов | `practice2.task10.HowMany` |

## Работа 3

| Задание | Запускаемый класс |
|---|---|
| 01. Math и Random - массивы | `practice3.randommath.Task01RandomArrays` |
| 03. Возрастающая последовательность | `practice3.randommath.Task03IncreasingArray` |
| 04. Чётные элементы | `practice3.randommath.Task04EvenArray` |
| Оболочки. Преобразования Double | `practice3.wrappers.DoubleDemo` |
| Форматирование. Конвертер валют | `practice3.formatting.CurrencyConverterDemo` |

[Оболочки, задание 2: заполненная таблица методов](src/practice3/wrappers/WrapperMethods.md).

В конвертере используются условные учебные курсы, указанные в консоли.

## Работа 4

| Задание | Запускаемый класс |
|---|---|
| 01. Времена года | `practice4.task01.SeasonsDemo` |

## Работа 6

| Задание | Запускаемый класс |
|---|---|
| 11. Перевод температуры | `practice6.task11.TemperatureDemo` |

## Работа 7

| Задание | Запускаемый класс |
|---|---|
| 01-03. Движущийся прямоугольник | `practice7.task01to03.MovableDemo` |
| 04. Математический интерфейс | `practice7.task04.MathDemo` |
| 05-06. Обработка строк | `practice7.task05to06.StringsDemo` |
| 07-08. Книги и журналы | `practice7.task07to08.PrintableDemo` |

[UML-диаграмма для draw.io](diagrams/Movable.drawio) · [Просмотр диаграммы](diagrams/Movable.svg).
