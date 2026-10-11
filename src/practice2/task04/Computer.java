package practice2.task04;

import java.util.Locale;

public class Computer {
    private final int id;
    private final String brand;
    private final String model;
    private final double price;

    public Computer(int id, String brand, String model, double price) {
        if (id <= 0 || brand == null || brand.isBlank() || model == null || model.isBlank()
                || !Double.isFinite(price) || price < 0) {
            throw new IllegalArgumentException("Некорректные данные компьютера.");
        }
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public int getId() { return id; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return String.format(Locale.US, "#%d %s %s, %.2f руб.", id, brand, model, price);
    }
}
