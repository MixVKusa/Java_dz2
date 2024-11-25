package ru.tataev.geography;

import java.util.*;

public class Town {
    protected String title;
    protected List<Way> ways = new ArrayList<>();

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
        if (newWay == null || this == newWay.getToGo()){
            return;
        }
        int flag = 1;
        for (int i = 0; i < ways.size(); i++){
            if (ways.get(i).getToGo() == newWay.getToGo()){
                ways.get(i).setCost(newWay.getCost());
                flag = 0;
                break;
//                throw new IllegalArgumentException("Two ways in one town");
            }
        }
        if (flag == 1){ways.add(newWay);}
    }

    public void remove(String name){
        if (name == null){
            return;
        }
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Town town)) return false;
        if (ways.size() != town.ways.size()) return false;
        return ways.containsAll(town.ways);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for (Way way : ways) {
            hash += way.hashCode();
        }
        return hash;
    }
}
