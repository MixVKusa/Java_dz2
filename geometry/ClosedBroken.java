package ru.tataev.geometry;

import java.util.List;

public class ClosedBroken extends Broken {
    public ClosedBroken() {
    }

    public ClosedBroken(Point... line) {
        super(line);
    }

    public ClosedBroken(List<Point> line) {
        super(line);
    }

    public double len(){
        if (line.isEmpty()){
            return 0;
        }
        double control = Math.sqrt((Math.pow(line.getFirst().x - line.getLast().x, 2) + Math.pow(line.getFirst().y - line.getLast().y, 2)));
        return super.len() + control;
    }
}
