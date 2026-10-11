package practice2.task06;

/** Отдельная модель окружности для задания 6. */
public final class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) { setX(x); setY(y); setRadius(radius); }
    public double getX() { return x; }
    public double getY() { return y; }
    public double getRadius() { return radius; }
    public void setX(double x) {
        if (!Double.isFinite(x)) throw new IllegalArgumentException("Некорректная координата.");
        this.x = x;
    }
    public void setY(double y) {
        if (!Double.isFinite(y)) throw new IllegalArgumentException("Некорректная координата.");
        this.y = y;
    }
    public void setRadius(double radius) {
        if (!Double.isFinite(radius) || radius < 0) throw new IllegalArgumentException("Некорректный радиус.");
        this.radius = radius;
    }
    public double getArea() { return Math.PI * radius * radius; }
    public double getCircumference() { return 2 * Math.PI * radius; }

    /** Сравнение по размеру: отрицательное число, ноль или положительное число. */
    public int compareTo(Circle other) { return Double.compare(radius, other.radius); }

    @Override
    public String toString() { return "Circle[x=" + x + ", y=" + y + ", radius=" + radius + "]"; }
}
