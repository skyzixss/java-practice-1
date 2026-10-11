package practice7.task04;

public class MathFunc implements MathCalculable {
    @Override
    public double power(double base, double exponent) { return Math.pow(base, exponent); }

    @Override
    public double complexModulus(double real, double imaginary) { return Math.hypot(real, imaginary); }

    public double circumference(double radius) {
        if (!Double.isFinite(radius) || radius < 0) throw new IllegalArgumentException("Некорректный радиус.");
        return 2 * PI * radius;
    }
}
