package ru.tataev.main;

import ru.tataev.animals.*;
import ru.tataev.calculating.Fraction;
import ru.tataev.calculating.House;
import ru.tataev.capacity.Box;
import ru.tataev.capacity.Storage;
import ru.tataev.geography.DoubleTown;
import ru.tataev.geography.Town;
import ru.tataev.geography.Way;
import ru.tataev.geometry.*;
import ru.tataev.shoot.Gun;
import ru.tataev.society.Human;
import ru.tataev.society.Naming;
import ru.tataev.society.Student;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {
    public static void test1(){
//        ru.tataev.society.Student person1 = new ru.tataev.society.Student("Вася");
//        person1.marks = new int[]{1, 5, 4};
//
//        ru.tataev.society.Student person2 = new ru.tataev.society.Student("Петя");
//        person2.marks = person1.marks.clone();
//        person2.marks[0] = 5;
//
//        System.out.println(person1);
//        System.out.println(person2);
//
//        ru.tataev.society.Student person3 = new ru.tataev.society.Student("Андрей");
//        person3.marks = person1.marks.clone();
//        System.out.println(person3);
        Integer[] a = {1, 5, 4};
        Student person1 = new Student("Вася", new ArrayList<>(Arrays.asList(a)));
        Student person2 = new Student("Максим");

        System.out.println(person1);
        System.out.println(person2);
    }

    public static void test2() {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point[] pGroup1 = {p1, p2, p3};
        Broken bLine1 = new Broken(new ArrayList<>(Arrays.asList(pGroup1)));

        Point p4 = new Point(2, -5);
        Point p5 = new Point(4, -8);
        Point[] pGroup2 = {p1, p4, p5, p3};
        Broken bLine2 = new Broken(new ArrayList<>(Arrays.asList(pGroup2)));

        p1.setX(-8);
        p2.setY(10);

        System.out.println(bLine1);
        System.out.println(bLine2);
    }

    public static void test3(){
        Town townA = new Town("ru.tataev.main.A");
        Town townB = new Town("ru.tataev.main.B");
        Town townC = new Town("C");
        Town townD = new Town("D");
        Town townE = new Town("E");
        Town townF = new Town("F");
        Way da = new Way(townA, 6);
        Way ba = new Way(townA, 5);
        Way ab = new Way(townB, 5);
        Way fb = new Way(townB, 1);
        Way cb = new Way(townB, 3);
        Way bc = new Way(townC, 3);
        Way dc = new Way(townC, 4);
        Way cd = new Way(townD, 4);
        Way ad = new Way(townD, 6);
        Way de = new Way(townE, 2);
        Way fe = new Way(townE, 2);
        Way af = new Way(townF, 1);
        Way ef = new Way(townF, 2);

//        townA.ways = new ru.tataev.geography.Way[]{ab, af, ad};
//        townB.ways = new ru.tataev.geography.Way[]{ba, bc};
//        townC.ways = new ru.tataev.geography.Way[]{cb, cd};
//        townD.ways = new ru.tataev.geography.Way[]{dc, da, de};
//        townE.ways = new ru.tataev.geography.Way[]{ef};
//        townF.ways = new ru.tataev.geography.Way[]{fe, fb};

        System.out.println(townA);
        System.out.println(townD);
    }

    public static void test4(){
        Fraction fr1 = new Fraction(0, 2);
        Fraction fr2 = new Fraction(-8, 10);

        System.out.println(fr2.sum(fr1));
    }

    public static void test5(){
        Point p1 = new Point(1, 3);
        Point p2 = new Point(23, 8);
        Line l1 = new Line(p1, p2);
        Line l2 = Line.of(5, 10, 25, 10);
        Line l3 = new Line(l1.getP1(), l2.getP2());

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }

    public static void test6(){
        House h1 = new House(2);
        House h2 = new House(35);
        House h3 = new House(91);

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
    }

    public static void test7(){
        Naming person1 = new Naming("Сергей", "Пушкин");
        Naming person2 = new Naming("Петр", "Чудов");
        Naming person3 = new Naming("Борис");

        Human human1 = new Human("Лев", 170);
        Human human2 = new Human(person1, 168, human1);
        Human human3 = new Human("Александр", 167, human2);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }

    public static void test8(){
        Gun g1 = new Gun(3);
        g1.shot();
        g1.shot();
        g1.shot();
        g1.shot();
        g1.shot();
    }

    public static void test9(){
        Cat cat = new Cat("Барсик");
        cat.meow();
        cat.meow(3);
    }

    public static void test10(){
        Fraction fr1 = new Fraction(1, 3);
        Fraction fr2 = new Fraction(2, 5);

        System.out.println(fr2.sum(fr1));
        System.out.println(fr1.minus(fr2));
        System.out.println(fr2.mult(fr1));
        System.out.println(fr2.div(fr1));

        System.out.println(fr1.floatValue());
        System.out.println(fr2.intValue());
    }

    public static void test11(){
        Square sq1 = new Square(5, 3, 23);
        Broken polyLine1 = sq1.toBroken();
        System.out.println(sq1);
        System.out.println(polyLine1);
        System.out.println(polyLine1.len());
    }

    public static void test12(){
        Sparrow bird1 = new Sparrow();
        Gowk bird2 = new Gowk();
        Parrot bird3 = new Parrot("Кукареку");

        bird1.sing();
        bird2.sing();
        bird3.sing();
    }

    public static void test13(){
        Square sq = new Square(0, 0, 15);
        Rectangle rec = new Rectangle(0, 0, 15, 10);
        Circle cir = new Circle(0, 0, 5);
        Triangle tr = new Triangle(0, 0, 15, 0, 15, 5);

        System.out.println(sq.square());
        System.out.println(rec.square());
        System.out.println(cir.square());
        System.out.println(tr.square());
    }

    public static void test14(){
        B b = new B();
        System.out.println(b.n);
    }

    public static void test15(){
        System.out.println(PolymorphDZ.doubleSum(2, new Fraction(3, 5), 2.3));
        System.out.println(PolymorphDZ.doubleSum(3.6, new Fraction(49, 12), 3, new Fraction(3, 2)));
        System.out.println(PolymorphDZ.doubleSum(new Fraction(1, 3), 1));
    }

    public static void test16(){
        Sparrow s1 = new Sparrow();
        Sparrow s2 = new Sparrow();
        Gowk g1 = new Gowk();
        Gowk g2 = new Gowk();
        Parrot p1 = new Parrot("Крокодил");
        Parrot p2 = new Parrot("Опасен");
        Parrot p3 = new Parrot("Но какой");
        PolymorphDZ.singBird(s1, s2, g1, g2);
        PolymorphDZ.singBird(p1, p2, p3);
    }

    public static void test17() {
        Rectangle sq1 = new Rectangle(0, 0, 20, 20);
        Rectangle sq2 = new Rectangle(0, 0, 10, 10);
        Circle c1 = new Circle(10, -10, 10);
        Circle c2 = new Circle(-10, -10, 10);
        System.out.println(PolymorphDZ.sumSquare(sq1, sq2, c1, c2));
    }

    public static void test18() {
        Cat c1 = new Cat("Мишаня");
        Cat c2 = new Cat("0, 0, 10, 10");
        Meowable c3 = new Cat("3");
        Meowable c4 = new MeowableDog("Собака");
        PolymorphDZ.meow(c1, c2, c3, c4);
    }

    public static void test19(){
        DoubleTown townA = new DoubleTown("ru.tataev.main.A");
        DoubleTown townB = new DoubleTown("ru.tataev.main.B");
        DoubleTown townC = new DoubleTown("C");
        Way ab = new Way(townB, 8);
        Way ba = new Way(townA, 5);
        Way bc = new Way(townC, 3);
        townA.add(ab);
        townB.add(ba);
        townB.add(bc);

        System.out.println(townA);
        System.out.println(townB);
        System.out.println(townC);
    }

    public static void test20() {
        System.out.println(PolymorphDZ.doubleSum(7, new Fraction(11, 3), 3.21, new BigInteger("12345678912345678912", 10)));
    }

    public static void test21(Meowable m){
        m.meow();
        m.meow();
        m.meow();
        m.meow();
    }

    public static void test22(){
        Box<Integer> b = new Box<>();
        b.setObj(22);

        System.out.println(b.getObj());
    }

    public static void test23() {
        Storage<Integer> s1= new Storage<>(null);
        System.out.println(s1.getItem(0));

        Storage<Integer> s2 = new Storage<>(99);
        System.out.println(s2.getItem(-1));

        Storage<String> s3 = new Storage<>(null);
        System.out.println(s3.getItem("default"));

        Storage<String> s4 = new Storage<>("hello");
        System.out.println(s4.getItem("hello world"));
    }

    public static void test24() {
        Line<? extends Point> l1 = Line.of(5, 10, 15, 20);
        Line<? extends Point> l2 = Line.of(-7, 10, 15, 20, 30,40);
        ParametrizDZ.moveStartPointX(l1);
        ParametrizDZ.moveStartPointX(l2);
        System.out.println(l1.getP1());
        System.out.println(l2.getP1());
    }
}

class A{
    public int n = 14;
}

class B extends A{
    public int n = 29;
}
