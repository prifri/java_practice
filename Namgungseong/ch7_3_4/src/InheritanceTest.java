
class Point {
    int x;
    int y;
}

class Circle {
    Point p = new Point();
    int r;
}
public class InheritanceTest {
    public static void main (String[] args) {
        Circle c = new Circle();
        System.out.println(c.p.x);
        System.out.println(c.p.y);
        System.out.println(c.r);
//        System.out.println(c.toString());
    }
}
