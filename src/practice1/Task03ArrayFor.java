package practice1;

import java.util.Arrays;
import java.util.Locale;

/** Задание 3: инициализация массива, сумма и среднее в цикле for. */
public class Task03ArrayFor {
    public static void main(String[] args) {
        int[] numbers = {3, -2, 7, 0, 14};
        long sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Массив: " + Arrays.toString(numbers));
        System.out.println("Сумма: " + sum);
        System.out.printf(Locale.US, "Среднее арифметическое: %.2f%n", average);
    }
}
