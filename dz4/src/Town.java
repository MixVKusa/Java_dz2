public class Town {
    String title;
    Way[] ways;

    public Town(String title) {
        this(title, new Way[]{});
    }

    public Town(String title, Way[] ways) {
        this.title = title;
        this.ways = ways;
    }

    public String toString() {
        String res = title + " - [";
        for (int i = 0; i < ways.length; i++){
            res += ways[i].toGo.title + ": " + ways[i].cost;
            if (i < ways.length - 1){
                res += ", ";
            }
        }
        res += "]";
        return res;
    }
}
