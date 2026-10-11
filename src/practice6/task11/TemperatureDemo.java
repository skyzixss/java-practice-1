package practice6.task11;

import common.ConsoleInput;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TemperatureDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            double celsius = new ConsoleInput(scanner).readDouble("Температура по Цельсию:", -273.15);
            Convertable kelvin = new CelsiusToKelvin();
            Convertable fahrenheit = new CelsiusToFahrenheit();
            System.out.printf(Locale.US, "%.2f °C = %.2f K = %.2f °F%n",
                    celsius, kelvin.convert(celsius), fahrenheit.convert(celsius));
        } catch (NoSuchElementException error) {
            System.out.println("Ввод завершён.");
        } catch (IllegalArgumentException error) {
            System.out.println("Ошибка: " + error.getMessage());
        }
    }
}
