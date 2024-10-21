import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Square {
    private Point start;
    private int length;

    public Square(Point start, int length) {
        this(start.x, start.y, length);
    }

    public Square(int x, int y, int length) {
        this.start = new Point(x, y);
        setLength(length);
    }

    public Point getStart() {
        return start;
    }

    public int getLength() {
        return length;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public void setLength(int length) {
        if (length <= 0){
            throw new IllegalArgumentException("Length must be more than 0");
        }
        this.length = length;
    }

    public Broken toBroken(){
        Point p2 = new Point(start.x + length, start.y);
        Point p3 = new Point(start.x + length, start.y + length);
        Point p4 = new Point(start.x, start.y + length);

        return new Broken(start, p2, p3, p4);
    }

    public String toString() {
        return String.format("Квадрат в точке %s со стороной %d", start, length);
    }
}
