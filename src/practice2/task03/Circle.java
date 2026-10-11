package practice2.task03;

public final class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        setCenter(center);
        setRadius(radius);
    }

    public Point getCenter() { return new Point(center.getX(), center.getY()); }
    public void setCenter(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }
    public double getRadius() { return radius; }
    public void setRadius(double radius) {
        if (!Double.isFinite(radius) || radius < 0) {
            throw new IllegalArgumentException("Радиус должен быть конечным и неотрицательным.");
        }
        this.radius = radius;
    }

    @Override
    public String toString() { return "Circle[center=" + center + ", radius=" + radius + "]"; }
}
