
class Point {
    static int s_value;
    int b;

    static {
        System.out.println("Point SB");
    }


    Point() {
        s_value = 1;
        b = 2;
        System.out.println("Point a " + s_value + " b : " + b);
    }

    void check() {
        System.out.println("Point a " + s_value + " b : " + b);
    }
}

class Point1 extends Point {
    //부모 static 변수는 아에 사용하지 않는걸로 된다.
    //다른 자식이 부모 static 변수를 접근을 하면 부모 static 변수에 접근되고 여기엔 접근 안된다.
    static int s_value;
    int c;
    static {
        System.out.println("Point1 SB");
    }

    Point1() {
        s_value = 10;
        c = 3;
        System.out.println("Point1 C");
    }

    void show() {

        System.out.println("P1 : a : " + s_value + " b +: " + b + " c : " + c);
    }
}

class Point2 extends  Point {
    int b;
    int c;
    static {
        System.out.println("Point2 SB");
    }

    Point2() {
        super();
        System.out.println("Point2 C");
    }

    Point2(int a) {
        this();
        System.out.println("Point2 C" + a);
    }
    void show() {
        System.out.println("2hi?");
        System.out.println("P2 : a : " + s_value + " b +: " + b + " c : " + c);
        s_value = 2;
    }
}

public class ch7_1 {
    public static void main(String[] args) {
        Point1 point1 = new Point1();
        point1.show();
        point1.check();

        Point2 point2 = new Point2('가');
        point2.show();
        point1.check();

    }
}
