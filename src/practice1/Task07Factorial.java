package practice1;

import java.util.Scanner;

/** Задание 7: вычисление факториала методом класса с циклом. */
public class Task07Factorial {
    public static long factorial(int n) {
        // 20! помещается в long, а 21! уже превышает его верхнюю границу.
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Число должно быть от 0 до 20.");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            System.out.println("Введите целое число от 0 до 20:");
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: требуется целое число.");
                return;
            }
            int n = scanner.nextInt();
            try {
                System.out.println(n + "! = " + factorial(n));
            } catch (IllegalArgumentException error) {
                System.out.println("Ошибка: " + error.getMessage());
            }
        }
    }
}
