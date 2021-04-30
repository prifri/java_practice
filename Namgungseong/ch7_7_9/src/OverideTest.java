
class Point {
    int x;
    int y;

    public String toString() {
        return "x : " + x  + " y : " + y;
    }
}

class Point3 extends Point {
    int z;

    public String toString() {
        return super.toString() + " z : " + z;
    }
}
public class OverideTest {
    public static void main(String[] args) {
        Point3 p3 = new Point3();
//        System.out.println(p3.toString());
        //https://stackoverflow.com/questions/16627902/is-the-tostring-method-unnecessary
        System.out.println(p3);
    }
}
