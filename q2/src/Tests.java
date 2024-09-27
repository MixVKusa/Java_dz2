public class Tests {
    public static void test1() {
        Point visualPoint1 = new Point(1, 2);
        Point visualPoint2 = new Point(5, -9);
        Point visualPoint3 = new Point(0, 14);

        Line visualLine = new Line(visualPoint1, visualPoint2);
        System.out.println(visualLine.toString());

//        Point[] dots = {visualPoint1, visualPoint2, visualPoint3};
//        Quart1Print(dots);
    }
}
