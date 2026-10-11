package practice7.task04;

import java.util.Locale;

public class MathDemo {
    public static void main(String[] args) {
        MathFunc functions = new MathFunc();
        MathCalculable mc1 = functions;
        System.out.printf(Locale.US, "2^10 = %.0f%n", mc1.power(2, 10));
        System.out.printf(Locale.US, "|3 + 4i| = %.1f%n", mc1.complexModulus(3, 4));
        System.out.printf(Locale.US, "PI = %.8f%n", MathCalculable.PI);
        System.out.printf(Locale.US, "Длина окружности радиуса 5: %.4f%n", functions.circumference(5));
        // new MathCalculable() без реализации методов недопустим: это интерфейс.
    }
}
