package ru.tataev.geometry;

public abstract class AbstractPoint {
    protected String color;
    protected String time;

    protected String colorToString() {
        String res;
        if (color == null) {
            res = "";
        } else {
            res = ", " + color.substring(0, color.length() - 2) + "ого цвета";
        }
        return res;
    }

    protected String timeToString() {
        String res;
        if (time == null) {
            res = "";
        }
        else {
            res = "в" + time;
        }
        return res;
    }

    protected abstract String pointToString();

    public String toString() {
        return pointToString() + timeToString() + colorToString();
    }
}
