import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Town {
    private String title;
    private List<Way> ways;

    public Town(String title) {
        this(title, new ArrayList<>());
    }

    public Town(String title, Way...ways){
        this(title, new ArrayList<>(Arrays.asList(ways)));
    }

    public Town(String title, List<Way> ways) {
        this.title = title;
        for (Way way : ways) {
            add(way);
        }
    }

    public String getTitle() {
        return title;
    }

    public void add(Way newWay){
        if (newWay == null){
            return;
        }
        for (int i = 0; i < ways.size(); i++){
            if (ways.get(i).getToGo() == newWay.getToGo()){
                throw new IllegalArgumentException("Two ways in one town");
            }
        }
        ways.add(newWay);
    }

    public void remove(String name){
        for (int i = 0; i < ways.size(); i++){
            if (ways.get(i).getToGo().title == name){
                ways.remove(i);
                break;
            }
        }
    }

    public String toString() {
        String res = title + " - [";
        for (int i = 0; i < ways.size(); i++){
            res += ways.get(i).getToGo().title + ": " + ways.get(i).getCost();
            if (i < ways.size() - 1){
                res += ", ";
            }
        }
        res += "]";
        return res;
    }
}
