public class Test {
    public static void test1(){
        int[] arr = {1, 3, 5, 9};
        List.num = arr;
        List.size = 4;
        List.add(13);
        List.add(22);
        List.add(35);
        List.add(57);
        List.add(2, 100);
        List.printList();
    }

    public static void test2(){
        Naming person1 = new Naming("Клеопатра");
        Naming person2 = new Naming("Пушкин", "Александр", "Сергеевич");
        Naming person3 = new Naming("Владимир", "Маяковский");
        Human human1 = new Human(person1, 152);
        Human human2 = new Human(person2, 167);
        Human human3 = new Human(person3, 189);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }

    public static void test3(){
        Naming person1 = new Naming("Клеопатра");
        Naming person2 = new Naming("Пушкин", "Александр", "Сергеевич");
        Naming person3 = new Naming("Владимир", "Маяковский");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }

    public static void test4(){
        Naming person1 = new Naming("Иван", "Чудов");
        Naming person2 = new Naming("Петр", "Чудов");
        Naming person3 = new Naming("Борис");

        Human human1 = new Human(person1, 178);
        Human human2 = new Human(person2, 190, human1);
        Human human3 = new Human(person3, 130, human2);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }

    public static void test5(){
        House home1 = new House(1);
        House home2 = new House(5);
        House home3 = new House(23);

        System.out.println(home1);
        System.out.println(home2);
        System.out.println(home3);
    }

    public static void test6(){
        Office depart = new Office("IT");
        Employee person1 = new Employee("Петрова", depart);
        Employee person2 = new Employee("Козлова", depart);
        Employee person3 = new Employee("Сидорова", depart);
        depart.boss = person2;

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
