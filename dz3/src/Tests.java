import java.lang.reflect.Array;
import java.util.Arrays;

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
        Student person1 = new Student("Вася", new int[]{1, 5, 4});
        Student person2 = new Student("Максим");

        System.out.println(person1);
        System.out.println(person2);
    }

    public static void test2() {
        Point p1 = new Point(1, 5);
        Point p2 = new Point(2, 8);
        Point p3 = new Point(5, 3);
        Point[] pGroup1 = {p1, p2, p3};
        Broken bLine1 = new Broken(pGroup1);

        Point p4 = new Point(2, -5);
        Point p5 = new Point(4, -8);
        Point[] pGroup2 = {p1, p4, p5, p3};
        Broken bLine2 = new Broken(pGroup2);

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

        townA.ways = new Way[]{ab, af, ad};
        townB.ways = new Way[]{ba, bc};
        townC.ways = new Way[]{cb, cd};
        townD.ways = new Way[]{dc, da, de};
        townE.ways = new Way[]{ef};
        townF.ways = new Way[]{fe, fb};

        System.out.println(townA);
        System.out.println(townD);
    }

    public static void test4(){
        Office depart = new Office("IT");
        Employee person1 = new Employee("Петрова", depart);
        Employee person2 = new Employee("Козлова", depart);
        Employee person3 = new Employee("Сидорова", depart);
        depart.boss = person2;

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(depart);
    }

    public static void test5(){
        Point p1 = new Point(1, 3);
        Point p2 = new Point(23, 8);
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(5, 10, 25, 10);
        Line l3 = new Line(l1.p1, l2.p2);

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
}
