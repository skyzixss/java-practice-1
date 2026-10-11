package practice2.task04;

import common.ConsoleInput;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestShop {
    private static void printComputers(Computer[] computers) {
        if (computers.length == 0) System.out.println("Компьютеры не найдены.");
        for (Computer computer : computers) System.out.println(computer);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in, "UTF-8")) {
            ConsoleInput input = new ConsoleInput(scanner);
            ComputerInput computerInput = new ConsoleComputerInput(input);
            Shop shop = new Shop();
            int size = input.readInt("Сколько компьютеров добавить?", 0, 1000);
            while (shop.getCount() < size) {
                try {
                    shop.addComputer(computerInput.readComputer());
                } catch (IllegalArgumentException error) {
                    System.out.println(error.getMessage());
                }
            }
            while (true) {
                int command = input.readInt("1 - список, 2 - добавить, 3 - удалить, 4 - поиск, 0 - выход", 0, 4);
                if (command == 0) break;
                switch (command) {
                    case 1: printComputers(shop.getComputers()); break;
                    case 2:
                        try {
                            shop.addComputer(computerInput.readComputer());
                        } catch (IllegalArgumentException error) {
                            System.out.println(error.getMessage());
                        }
                        break;
                    case 3:
                        int id = input.readInt("Номер удаляемого компьютера:", 1, Integer.MAX_VALUE);
                        System.out.println(shop.removeComputer(id) ? "Компьютер удалён." : "Номер не найден.");
                        break;
                    case 4: printComputers(shop.search(input.readText("Марка или модель для поиска:"))); break;
                    default: break;
                }
            }
        } catch (NoSuchElementException error) {
            System.out.println("Ввод завершён.");
        }
    }
}
