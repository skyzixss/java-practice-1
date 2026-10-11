package practice7.task01to03;

public final class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this(new MovablePoint(x1, y1, xSpeed, ySpeed), new MovablePoint(x2, y2, xSpeed, ySpeed));
    }

    public MovableRectangle(MovablePoint topLeft, MovablePoint bottomRight) {
        if (topLeft.getX() > bottomRight.getX() || topLeft.getY() > bottomRight.getY()) {
            throw new IllegalArgumentException("Неверный порядок углов прямоугольника.");
        }
        this.topLeft = copy(topLeft);
        this.bottomRight = copy(bottomRight);
    }

    private static MovablePoint copy(MovablePoint p) {
        return new MovablePoint(p.getX(), p.getY(), p.getXSpeed(), p.getYSpeed());
    }

    public MovablePoint getTopLeft() { return copy(topLeft); }
    public MovablePoint getBottomRight() { return copy(bottomRight); }

    // Имя SpeedTest сохранено из условия задания.
    public boolean SpeedTest() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
                && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    private void checkSpeed() {
        if (!SpeedTest()) throw new IllegalStateException("Скорости углов должны совпадать.");
    }

    @Override
    public void moveUp() { checkSpeed(); topLeft.moveUp(); bottomRight.moveUp(); }
    @Override
    public void moveDown() { checkSpeed(); topLeft.moveDown(); bottomRight.moveDown(); }
    @Override
    public void moveLeft() { checkSpeed(); topLeft.moveLeft(); bottomRight.moveLeft(); }
    @Override
    public void moveRight() { checkSpeed(); topLeft.moveRight(); bottomRight.moveRight(); }

    @Override
    public String toString() {
        return "MovableRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }
}
