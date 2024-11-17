package ru.tataev.animals;

public class Cat implements Meowable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String toString() {
        return "кот: " + name;
    }

    public void meow(int multiple) {
        String res = name + ": ";
        for (int i = 0; i<multiple; i++){
            res += "мяу";
            if (i < multiple-1){
                res += "-";
            }
        }
        res += "!";
        System.out.println(res);
    }

    public void meow() {
        meow(1);
    }
}
