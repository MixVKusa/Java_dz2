package ru.tataev.main;

import ru.tataev.animals.Meowable;
import ru.tataev.calculating.Save;
import ru.tataev.capacity.Storage;
import ru.tataev.data.DataStream;
import ru.tataev.data.DataStream.*;
import ru.tataev.geometry.Point;
import ru.tataev.society.Student;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Bober", 2, 2, 2, 3, 4, 2);
        s1.setName("BOBA");
        Save save1 = s1.save();
        s1.setName("sobaka");
        save1.load();
        System.out.println(s1);
    }
}

//class MeowCount implements Meowable {
//    private Meowable entity;
//    private int meows;
//
//    public MeowCount(Meowable entity) {
//        this.entity = entity;
//    }
//
//    public int getMeows() {
//        return meows;
//    }
//
//    @Override
//    public void meow() {
//        entity.meow();
//        meows++;
//    }
//}
//
//class MeowAlert implements Meowable {
//    private Meowable entity;
//
//    public MeowAlert(Meowable entity) {
//        this.entity = entity;
//    }
//
//    @Override
//    public void meow() {
//        System.out.println("ALERT!!!");
//        entity.meow();
//    }
//}