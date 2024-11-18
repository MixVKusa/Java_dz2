package ru.tataev.geometry;

public abstract class Figure {
    protected Point start;

    public Figure(Point start) {
        setStart(start);
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }

    public abstract double square();
}
