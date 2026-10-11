package practice2.task03;

public final class Point {
    private double x;
    private double y;

    public Point(double x, double y) { setX(x); setY(y); }
    public double getX() { return x; }
    public double getY() { return y; }
    public void setX(double x) {
        if (!Double.isFinite(x)) throw new IllegalArgumentException("Координата должна быть конечной.");
        this.x = x;
    }
    public void setY(double y) {
        if (!Double.isFinite(y)) throw new IllegalArgumentException("Координата должна быть конечной.");
        this.y = y;
    }

    @Override
    public String toString() { return "(" + x + ", " + y + ")"; }
}
