package ru.tataev.geometry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Broken implements Lengthable {
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
        add(Arrays.asList(points));
    }

    public void add(List<Point> points){
        line.addAll(points);
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

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        List<Point> other = ((Broken) obj).getLine();
        if (line.size() != other.size()) return false;
        for (int i = 0; i < line.size(); i++){
            if (!line.get(i).equals(other.get(i))) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(line.toArray());
    }
}