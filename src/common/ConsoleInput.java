package common;

import java.util.NoSuchElementException;
import java.util.Scanner;

/** Чтение с повторным запросом при ошибке пользователя. */
public class ConsoleInput {
    private final Scanner scanner;

    public ConsoleInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readLine(String prompt) {
        System.out.println(prompt);
        if (!scanner.hasNextLine()) {
            throw new NoSuchElementException("Ввод завершён.");
        }
        return scanner.nextLine().strip();
    }

    public String readText(String prompt) {
        while (true) {
            String value = readLine(prompt);
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Введите непустую строку.");
        }
    }

    public int readInt(String prompt, int min, int max) {
        while (true) {
            try {
                int value = Integer.parseInt(readLine(prompt));
                if (value >= min && value <= max) {
                    return value;
                }
            } catch (NumberFormatException ignored) {
                // Повторяем запрос при вводе текста вместо целого числа.
            }
            System.out.println("Введите целое число от " + min + " до " + max + ".");
        }
    }

    public double readDouble(String prompt, double min) {
        while (true) {
            try {
                double value = Double.parseDouble(readLine(prompt).replace(',', '.'));
                if (Double.isFinite(value) && value >= min) {
                    return value;
                }
            } catch (NumberFormatException ignored) {
                // Допускается точка или запятая как десятичный разделитель.
            }
            System.out.println("Введите конечное число не меньше " + min + ".");
        }
    }
}
