import javax.xml.transform.Source;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;

public class Tests {
    public static void test1(){
//        Student person1 = new Student("Вася");
//        person1.marks = new int[]{1, 5, 4};
//
//        Student person2 = new Student("Петя");
//        person2.marks = person1.marks.clone();
//        person2.marks[0] = 5;
//
//        System.out.println(person1);
//        System.out.println(person2);
//
//        Student person3 = new Student("Андрей");
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

        p1.x = -8;
        p2.y = 10;

        System.out.println(bLine1);
        System.out.println(bLine2);
    }

    public static void test3(){
        Town townA = new Town("A");
        Town townB = new Town("B");
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

//        townA.ways = new Way[]{ab, af, ad};
//        townB.ways = new Way[]{ba, bc};
//        townC.ways = new Way[]{cb, cd};
//        townD.ways = new Way[]{dc, da, de};
//        townE.ways = new Way[]{ef};
//        townF.ways = new Way[]{fe, fb};

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
        Line l2 = new Line(5, 10, 25, 10);
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
}
