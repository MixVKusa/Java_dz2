package ru.tataev.animals;

public class MeowableDog implements Meowable {
    String name;

    public MeowableDog(String name) {
        this.name = name;
    }

    public void meow(){
        System.out.println(name + ": Гав-мяу?");
    }
}
