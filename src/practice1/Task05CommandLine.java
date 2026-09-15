package practice1;

/** Задание 5: вывод аргументов командной строки в цикле for. */
public class Task05CommandLine {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы командной строки не переданы.");
            return;
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
