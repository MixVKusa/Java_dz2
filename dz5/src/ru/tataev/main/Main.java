package ru.tataev.main;

import ru.tataev.animals.Meowable;
import ru.tataev.data.DataStream;
import ru.tataev.data.DataStream.*;
import ru.tataev.geometry.Point;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(-5, 3);
        Point p3 = new Point(7, 4);
        List<Point> l1 = DataStream.of(p1, p2, p3).map;
        System.out.println(l1);
    }
}

class MeowCount implements Meowable {
    private Meowable entity;
    private int meows;

    public MeowCount(Meowable entity) {
        this.entity = entity;
    }

    public int getMeows() {
        return meows;
    }

    @Override
    public void meow() {
        entity.meow();
        meows++;
    }
}

class MeowAlert implements Meowable {
    private Meowable entity;

    public MeowAlert(Meowable entity) {
        this.entity = entity;
    }

    @Override
    public void meow() {
        System.out.println("ALERT!!!");
        entity.meow();
    }
}