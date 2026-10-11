package practice7.task01to03;

public class MovableDemo {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        System.out.println("Точка: " + point);
        Movable movingPoint = point;
        movingPoint.moveRight();
        movingPoint.moveUp();
        System.out.println("Точка после движения: " + point);

        MovableRectangle rectangle = new MovableRectangle(0, 0, 10, 5, 2, 3);
        System.out.println(rectangle);
        System.out.println("SpeedTest: " + rectangle.SpeedTest());
        Movable movable = rectangle;
        movable.moveUp(); System.out.println("Вверх: " + rectangle);
        movable.moveRight(); System.out.println("Вправо: " + rectangle);
        movable.moveDown(); System.out.println("Вниз: " + rectangle);
        movable.moveLeft(); System.out.println("Влево: " + rectangle);

        MovableRectangle unequal = new MovableRectangle(
                new MovablePoint(0, 0, 1, 1), new MovablePoint(10, 5, 2, 1));
        System.out.println("Разные скорости, SpeedTest: " + unequal.SpeedTest());
        try {
            unequal.moveRight();
        } catch (IllegalStateException error) {
            System.out.println(error.getMessage());
        }
    }
}
