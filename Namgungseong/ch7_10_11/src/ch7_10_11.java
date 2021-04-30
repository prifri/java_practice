class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point {
    int z;
    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

public class ch7_10_11 {
    public static void main(String[] args) {
        Point3D p = new Point3D(1, 2, 3);
    }
}
