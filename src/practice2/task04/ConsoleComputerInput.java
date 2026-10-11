package practice2.task04;

import common.ConsoleInput;

public class ConsoleComputerInput implements ComputerInput {
    private final ConsoleInput input;

    public ConsoleComputerInput(ConsoleInput input) { this.input = input; }

    @Override
    public Computer readComputer() {
        int id = input.readInt("Номер компьютера:", 1, Integer.MAX_VALUE);
        String brand = input.readText("Марка:");
        String model = input.readText("Модель:");
        double price = input.readDouble("Цена в рублях:", 0);
        return new Computer(id, brand, model, price);
    }
}
