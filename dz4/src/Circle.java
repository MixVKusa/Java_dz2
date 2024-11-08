public class Circle extends Figure{
    private int radius;

    public Circle(Point start, int radius) {
        this(start.x, start.y, radius);
    }

    public Circle(int x, int y, int radius) {
        super(new Point(x, y));
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius <= 0) throw new IllegalArgumentException("Arguments of geometric quantities must be greater than 0.");
        this.radius = radius;
    }

    @Override
    public double square() {
        return Math.PI * radius * radius;
    }
}
