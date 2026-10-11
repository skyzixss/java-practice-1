package practice2.task06;

import java.util.Locale;

public class CircleTest {
    public static void main(String[] args) {
        Circle first = new Circle(0, 0, 2);
        Circle second = new Circle(1, 3, 4);
        first.setX(2);
        first.setY(-1);
        first.setRadius(3);
        System.out.println(first);
        System.out.printf(Locale.US, "Центр: (%.1f, %.1f); радиус: %.1f%n", first.getX(), first.getY(), first.getRadius());
        System.out.printf(Locale.US, "Площадь: %.4f; длина: %.4f%n", first.getArea(), first.getCircumference());
        System.out.println("Первая окружность меньше второй: " + (first.compareTo(second) < 0));
        second.setRadius(3);
        System.out.println("Радиусы равны: " + (first.compareTo(second) == 0));
    }
}
