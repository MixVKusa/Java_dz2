package ru.tataev.main;

import ru.tataev.animals.Cat;
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

        Cat cat = new Cat("Mursik");

        Tests.test21(cat);
    }
}

class Cat2 extends Cat{
    private int meows;

    public Cat2(String name) {
        super(name);
    }

    public int getMeows() {
        return meows;
    }

    @Override
    public void meow() {
        super.meow();
        meows++;
    }
}