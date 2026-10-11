package practice3.randommath;

import common.ConsoleInput;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class Task04EvenArray {
    public static int[] generate(int n, Random random) {
        if (n <= 0) throw new IllegalArgumentException("Размер должен быть положительным.");
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            // long позволяет включить n в диапазон без переполнения n + 1.
            values[i] = (int) random.nextLong((long) n + 1);
        }
        return values;
    }

    public static int[] selectEven(int[] values) {
        int count = 0;
        for (int value : values) if (value % 2 == 0) count++;
        int[] even = new int[count];
        int index = 0;
        for (int value : values) if (value % 2 == 0) even[index++] = value;
        return even;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            // В условии PDF после слова «больше» число пропущено: принимаем n > 0.
            int n = new ConsoleInput(scanner).readInt("Введите натуральное число n:", 1, Integer.MAX_VALUE);
            int[] values = generate(n, new Random());
            int[] even = selectEven(values);
            System.out.println("Исходный массив: " + Arrays.toString(values));
            if (even.length == 0) System.out.println("Чётных элементов нет.");
            else System.out.println("Чётные элементы: " + Arrays.toString(even));
        } catch (NoSuchElementException error) {
            System.out.println("Ввод завершён.");
        }
    }
}
