package ru.tataev.geometry;

import java.util.Objects;

public class Point {
    protected int x;
    protected int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        String res = "{" + x + ", " + y + "}";
        return res;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        if (x != ((Point) obj).x || y != ((Point) obj).y) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
