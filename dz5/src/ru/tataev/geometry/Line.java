package ru.tataev.geometry;

import java.util.List;
import java.util.Objects;

public class Line<P extends Point> implements Lengthable, PolyLine, Cloneable {
    private P p1;
    private P p2;

    public Line(P p1, P p2){
        if (p1.getClass() != p2.getClass()) throw new RuntimeException();
        setP1(p1);
        setP2(p2);
    }

//    public Line(int x1, int y1, int x2, int y2) {
//        setP1(new Point(x1, y1));
//        setP2(new Point(x2, y2));
//    }

    public static Line<Point> of(int x1, int y1, int x2, int y2){
        return new Line<>(new Point(x1, y1), new Point(x2, y2));
    }

    public static Line<Point3D> of(int x1, int y1, int z1, int x2, int y2, int z2){
        return new Line<>(new Point3D(x1, y1, z1), new Point3D(x2, y2, z2));
    }

    public P getP1() {
        return (P) p1;
    }

    public P getP2() {
        return (P) p2;
    }

    @SuppressWarnings("unchecked")
    public void setP1(P p1) {
        this.p1 = (P) p1.clone();
    }

    @SuppressWarnings("unchecked")
    public void setP2(P p2) {
        this.p2 = (P) p2.clone();
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
        return "Line from " + p1 + " to " + p2;
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (!(p1.equals(((Line<P>) obj).p1) && p2.equals(((Line<P>) obj).p2)) &&
                !(p1.equals(((Line<P>) obj).p2) && p2.equals(((Line<P>) obj).p1))) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return p1.hashCode() + p2.hashCode();
    }

    @Override
    @SuppressWarnings("unchecked")
    public Line<P> clone() {
        try {
            Line<P> res = (Line<P>) super.clone();
            res.p1 = (P) this.p1.clone();
            res.p2 = (P) this.p2.clone();
            return res;
        }
        catch (CloneNotSupportedException ex){
            throw new RuntimeException();
        }
    }
}
