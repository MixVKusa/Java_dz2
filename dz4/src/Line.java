public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this(p1.x, p1.y, p2.x, p2.y);
    }

    public Line(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double len(){
        return Math.sqrt((Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2)));
    }

    public String toString(){
        return "Line from " + p1 + " to " + p2;
    }
}
