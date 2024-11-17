package ru.tataev.geometry;

public class Triangle extends Figure implements PolyLine {
    private Point second;
    private Point third;

    public Triangle(Point start, Point second, Point third) {
        this(start.x, start.y, second.x, second.y, third.x, third.y);
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(new Point(x1, y1));
        setSecond(new Point(x2, y2));
        setThird(new Point(x3, y3));
    }

    public void setSecond(Point second) {
        this.second = second;
    }

    public void setThird(Point third) {
        this.third = third;
    }

    public Point getSecond() {
        return second;
    }

    public Point getThird() {
        return third;
    }

    @Override
    public Broken toBroken() {
        return new ClosedBroken(start, second, third);
    }

    @Override
    public double square() {
        double line1 = Math.sqrt(Math.pow(start.x - second.x, 2) + Math.pow(start.y - second.y, 2));
        double line2 = Math.sqrt(Math.pow(third.x - second.x, 2) + Math.pow(third.y - second.y, 2));
        double line3 = Math.sqrt(Math.pow(start.x - third.x, 2) + Math.pow(start.y - third.y, 2));
        double p = (line1 + line2 + line3) / 2;
        return Math.sqrt(p * (p - line1) * (p - line2) * (p - line3));
    }
}
