import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Broken {
    protected List<Point> line;

    public Broken() {
        this(new ArrayList<>(List.of()));
    }

    public Broken(Point...line) {
        this(new ArrayList<>(Arrays.asList(line)));
    }

    public Broken(List<Point> line) {
        setLine(line);
    }

    public List<Point> getLine() {
        return new ArrayList<>(line);
    }

    public void setLine(List<Point> line) {
        this.line = line;
    }

    public void setLine(Point...line) {
        setLine(new ArrayList<>(Arrays.asList(line)));
    }

    public void add(Point...points){
        line.addAll(Arrays.asList(points));
    }

    public double len(){
        double length = 0;
        for (int i = 0; i < line.size() - 1; i++){
            length += Math.sqrt((Math.pow(line.get(i).x - line.get(i+1).x, 2) + Math.pow(line.get(i).y - line.get(i+1).y, 2)));
        }
        return length;
    }

    public String toString(){
        String res = "Линия [";
        for (int i = 0; i < line.size(); i++){
            res += line.get(i);
            if (i < line.size() - 1){
                res += ", ";
            }
        }
        res += "]";
        return res;
    }
}
