public class Line {
    public Point p1;
    public Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }



    public String toString(){
        String res = "Line from " + p1 + " to " + p2;
        return res;
    }
}
