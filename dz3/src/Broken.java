public class Broken {
    public Point[] line;

    public Broken() {
        this(new Point[]{});
    }

    public Broken(Point[] line) {
        this.line = line;
    }

    public String toString(){
        String res = "Линия [";
        for (int i = 0; i < line.length; i++){
            res += line[i];
            if (i < line.length - 1){
                res += ", ";
            }
        }
        res += "]";
        return res;
    }
}
