import java.util.List;

public class DoubleTown extends Town{
    public DoubleTown(String title) {
        super(title);
    }

    public DoubleTown(String title, Way... ways) {
        super(title, ways);
    }

    public DoubleTown(String title, List<Way> ways) {
        super(title, ways);
    }

    public void add(Way newWay){
        super.add(newWay);
        Way reverseWay = new Way(this, newWay.getCost());
        List<Way> nextWays = newWay.getToGo().ways;
        if (nextWays.contains(reverseWay)){
            nextWays.get(nextWays.indexOf(reverseWay)).setCost(newWay.getCost());
            return;
        }
        newWay.getToGo().add(reverseWay);
    }
}
