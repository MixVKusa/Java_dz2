package ru.tataev.geometry;

import java.util.Objects;

public class Line implements Lengthable, PolyLine {
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

    @Override
    public Broken toBroken() {
        return new ClosedBroken(p1, p2);
    }

    @Override
    public double len(){
        return Math.sqrt((Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2)));
    }

    public String toString(){
        return "ru.tataev.geometry.Line from " + p1 + " to " + p2;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (!p1.equals(((Line) obj).p1) || !p2.equals(((Line) obj).p2)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(p1, p2);
    }
}
