class cal {
    cal(int a) {
        System.out.println("parent create" + a);
    }

    public int sum(int a, int b) {
        return a+b;
    }

    // Overloading
    public int sum(int a, int b, int c) {
        return this.sum(a, b) + c;
    }
}

class cal2 extends cal {
    cal2() {
        super(1);
        System.out.println("child create");
    }

    public static int minus(int a, int b) {
        return a-b;
    }

    //Overriding
    public int sum(int a, int b) {
        System.out.println("cal2!!");
        return super.sum(a, b);
    }
}

public class inheritanceApp {
    public static void main(String[] args) {

        cal2 test = new cal2();

        System.out.println("cal : " + test.sum(3,4));
        System.out.println("cal 3 : " + test.sum(3,4, 5));
        System.out.println("cal minus : " + cal2.minus(3,4));
    }
}
