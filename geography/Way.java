package ru.tataev.geography;

public class Way {
    private final Town toGo;
    private int cost;

    public Way(Town toGo, int cost) {
        this.toGo = toGo;
        setCost(cost);
    }
    public Town getToGo() {
        return toGo;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        if (cost < 0){
            throw new IllegalArgumentException("Cost can't be less than 0");
        }
        this.cost = cost;
    }
}
