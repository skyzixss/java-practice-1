package practice2.task03;

import java.util.Arrays;

public class Tester {
    private Circle[] circles = new Circle[2];
    private int count;

    public void addCircle(Circle circle) {
        if (count == circles.length) circles = Arrays.copyOf(circles, circles.length * 2);
        circles[count++] = circle;
    }
    public int getCount() { return count; }
    public Circle[] getCircles() { return Arrays.copyOf(circles, count); }

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.addCircle(new Circle(new Point(0, 0), 2));
        tester.addCircle(new Circle(new Point(3, 4), 5));
        tester.addCircle(new Circle(new Point(-1, 2), 1));
        System.out.println("Количество окружностей: " + tester.getCount());
        for (Circle circle : tester.getCircles()) System.out.println(circle);
    }
}
