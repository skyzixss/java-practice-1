package practice6.task11;

public class CelsiusToFahrenheit implements Convertable {
    @Override
    public double convert(double celsius) {
        if (!Double.isFinite(celsius) || celsius < -273.15) {
            throw new IllegalArgumentException("Температура должна быть не ниже -273.15 °C.");
        }
        double result = celsius * 1.8 + 32;
        if (!Double.isFinite(result)) throw new IllegalArgumentException("Температура слишком велика.");
        return result;
    }
}
