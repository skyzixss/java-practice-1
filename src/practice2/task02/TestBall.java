package practice2.task02;

public class TestBall {
    public static void main(String[] args) {
        Ball first = new Ball();
        Ball second = new Ball(2.5, 4.0);
        System.out.println(first);
        System.out.println(second);
        first.setX(1.0);
        first.setY(2.0);
        System.out.println("x=" + first.getX() + ", y=" + first.getY());
        second.setXY(3.0, 5.0);
        second.move(-1.0, 2.0);
        System.out.println("После перемещения: " + second);
    }
}
