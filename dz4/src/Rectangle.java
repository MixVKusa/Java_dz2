public class Rectangle extends Square{
    private int width;

    public Rectangle(Point start, int length, int width) {
        this(start.x, start.y, length, width);
    }

    public Rectangle(int x, int y, int length, int width) {
        super(new Point(x, y), length);
        setWidth(width);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0) throw new IllegalArgumentException("Arguments of geometric quantities must be greater than 0.");
        this.width = width;
    }

    @Override
    public double square() {
        return width * length;
    }
}
