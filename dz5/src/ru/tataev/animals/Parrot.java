package ru.tataev.animals;

import java.util.Random;

public class Parrot extends Bird {
    public Parrot(String text) {
        this.text = text;
    }

    @Override
    public void sing() {
        int symbolCount = new Random().nextInt(text.length() - 1) + 2;
        System.out.println(text.substring(0, symbolCount));
    }
}
