package practice1;

import java.util.Locale;

/** Задание 6: первые десять членов гармонического ряда, a(n) = 1/n. */
public class Task06HarmonicSeries {
    public static void main(String[] args) {
        System.out.println(" n | Член ряда | Значение");
        for (int n = 1; n <= 10; n++) {
            double term = 1.0 / n;
            System.out.printf(Locale.US, "%2d | 1/%-7d | %.6f%n", n, n, term);
        }
    }
}
