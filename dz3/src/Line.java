public class Line {
    public Point p1;
    public Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line(int x1, int y1, int x2, int y2) {
        this(new Point(x1, y1), new Point(x2, y2));
    }

    public String toString(){
        String res = "Line from " + p1 + " to " + p2;
        return res;
    }
}
