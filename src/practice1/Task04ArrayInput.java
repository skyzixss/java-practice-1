package practice1;

import java.util.Arrays;
import java.util.Scanner;

/** Задание 4: ввод массива, циклы do while и while, минимум и максимум. */
public class Task04ArrayInput {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            System.out.println("Введите количество элементов массива:");
            if (!scanner.hasNextInt()) {
                System.out.println("Ошибка: количество должно быть целым числом.");
                return;
            }
            int size = scanner.nextInt();
            if (size <= 0) {
                System.out.println("Ошибка: количество должно быть больше нуля.");
                return;
            }
            int[] numbers = new int[size];
            long sumDoWhile = 0;
            int i = 0;
            System.out.println("Введите " + size + " целых чисел:");
            // Размер положителен: тело do while можно выполнить хотя бы раз.
            do {
                if (!scanner.hasNextInt()) {
                    System.out.println("Ошибка: недостаточно целых чисел");
                    System.out.println("или введено значение вне диапазона int.");
                    return;
                }
                numbers[i] = scanner.nextInt();
                sumDoWhile += numbers[i];
                i++;
            } while (i < numbers.length);

            long sumWhile = 0;
            int min = numbers[0];
            int max = numbers[0];
            i = 0;
            while (i < numbers.length) {
                sumWhile += numbers[i];
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                }
                i++;
            }
            System.out.println("Массив: " + Arrays.toString(numbers));
            System.out.println("Сумма (do while): " + sumDoWhile);
            System.out.println("Сумма (while): " + sumWhile);
            System.out.println("Минимум: " + min);
            System.out.println("Максимум: " + max);
        }
    }
}
