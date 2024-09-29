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
        Human person1 = new Human("Клеопатра", 152);
        Human person2 = new Human("Пушкин", 167);
        Human person3 = new Human("Владимир", 189);

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
