class Car {
    static int s_value;
    int i_value;

    Car() {

    }

    Car(int a) {
        this();
    }

    Car(int a, int b) {
        this(3);
    }

    Car(int a, int b, int c) {
        //error 생성자 동작 이전에 임의의 작업을 한다는게 원론상 맞지 않아서 이런 규칙이 있는듯 싶다.
        //System.out.println("hello");
        this(1,2);
        this.i_value = 1;
        //this.s_value = 0x2; //compile warnning
        s_value = 0x2;

    }
}

public class ch6_36_37 {
    public static void main(String[] args) {

    }
}
