package practice3.formatting;

import common.ConsoleInput;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CurrencyConverterDemo {
    private static Currency readCurrency(ConsoleInput input, String prompt) {
        while (true) {
            try {
                return Currency.valueOf(input.readText(prompt).toUpperCase(Locale.ROOT));
            } catch (IllegalArgumentException error) {
                System.out.println("Введите RUB, USD или EUR.");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            ConsoleInput input = new ConsoleInput(scanner);
            System.out.println("Учебные курсы: 1 USD = 90 RUB; 1 EUR = 100 RUB.");
            Currency from = readCurrency(input, "Исходная валюта (RUB, USD, EUR):");
            Currency to = readCurrency(input, "Валюта результата (RUB, USD, EUR):");
            BigDecimal amount;
            while (true) {
                try {
                    amount = new BigDecimal(input.readLine("Сумма:").replace(',', '.'));
                    if (amount.signum() >= 0) break;
                } catch (NumberFormatException ignored) {
                    // Запрос повторяется, пока не введена корректная сумма.
                }
                System.out.println("Введите неотрицательную сумму.");
            }
            BigDecimal result = new CurrencyConverter().convert(amount, from, to);
            System.out.printf(Locale.US, "%.2f %s = %.2f %s%n", amount, from, result, to);
        } catch (NoSuchElementException error) {
            System.out.println("Ввод завершён.");
        }
    }
}
