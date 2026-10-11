package practice6.task11;

public class CelsiusToKelvin implements Convertable {
    @Override
    public double convert(double celsius) {
        if (!Double.isFinite(celsius) || celsius < -273.15) {
            throw new IllegalArgumentException("Температура должна быть не ниже -273.15 °C.");
        }
        return celsius + 273.15;
    }
}
