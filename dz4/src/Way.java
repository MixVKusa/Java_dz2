public class Way {
    private Town toGo;
    private int cost;

    public Town getToGo() {
        return toGo;
    }

    public int getCost() {
        return cost;
    }

    public Way(Town toGo, int cost) {
        this.toGo = toGo;
        this.cost = cost;
    }
}
