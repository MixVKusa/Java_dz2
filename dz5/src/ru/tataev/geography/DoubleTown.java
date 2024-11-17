package ru.tataev.geography;

import java.util.List;

public class DoubleTown extends Town {
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
        for (int i = 0; i < nextWays.size(); i++){
            if (nextWays.get(i).getToGo() == this){
                nextWays.get(i).setCost(newWay.getCost());
                return;
            }
        }
        newWay.getToGo().add(reverseWay);
    }
}
