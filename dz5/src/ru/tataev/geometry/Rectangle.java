package ru.tataev.geometry;

public class Rectangle extends Figure implements PolyLine {
    private int length;
    private int width;

    public Rectangle(Point start, int length, int width) {
        this(start.x, start.y, length, width);
    }

    public Rectangle(int x, int y, int length, int width) {
        super(new Point(x, y));
        setLength(length);
        setWidth(width);
    }

    public Rectangle(Point start, int length) {
        super(start);
        setLength(length);
        setWidth(length);
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        if (width <= 0) throw new IllegalArgumentException("Arguments of geometric quantities must be greater than 0.");
        this.width = width;
    }

    public void setLength(int length) {
        if (length <= 0) throw new IllegalArgumentException("Arguments of geometric quantities must be greater than 0.");
        this.length = length;
    }

    @Override
    public Broken toBroken() {
        Point p2 = new Point(start.x + length, start.y);
        Point p3 = new Point(start.x + length, start.y + length);
        Point p4 = new Point(start.x, start.y + length);

        return new ClosedBroken(start, p2, p3, p4);
    }

    @Override
    public double square() {
        return width * length;
    }

    public boolean isSquare(){
        return width == length;
    }
}
