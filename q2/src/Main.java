public class Main {
    public static void main(String[] args) {
        Tests.test1();
    }

    public static void Quart1Print(Point[] arr){
        for (Point i: arr){
            if (i.x >= 0 && i.y >= 0){
                System.out.println(i.toString());
            }
        }
    }
}