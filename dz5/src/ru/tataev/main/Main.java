package ru.tataev.main;

import ru.tataev.animals.Cat;
import ru.tataev.animals.Meowable;
import ru.tataev.geometry.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static ru.tataev.main.PolymorphDZ.power;

public class Main {
    public static void main(String[] args) {
//        Tests.test20();
//        System.out.println(power(args[0], args[1]));
//        Point created = new Point(0, 0);
//        java.awt.Point program = new java.awt.Point(0, 0);
//        List<Integer> list = new ArrayList<>();
//        list.add(28);
//        list.add(35);
//
//        for (Integer i: list){
//            System.out.println(i);
//        }
        Meowable cat = new Cat("Mursik");
        MeowCount cat2 = new MeowCount(cat);
        MeowAlert cat3 = new MeowAlert(cat2);

        Tests.test21(cat);
        System.out.println(cat3.);
//        Tests.test23();
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