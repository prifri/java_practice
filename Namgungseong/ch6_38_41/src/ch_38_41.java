
class Test {
    static int s_value = 0;
    int i_value = 0;

    //Class가 사용된 시점에서 동작한다.
    static {
        System.out.println("static block");
        //아래에 변수를 놓았을때 ++연산자가 안먹힌다.
        s_value++;
//        i_value = 1;
    }

    //인스턴스가 생성되면 동작한다.
    {
        System.out.println("instance block");
        i_value++;
    }
}

class Call {
    void run(){
        System.out.println("Call in");
        System.out.println("Call middle " + Test.s_value);
        Test test = new Test();
       System.out.println("Call out " + Test.s_value + test.i_value);
    }
}
public class ch_38_41 {
    public static void main(String[] args) {
        System.out.println("main in");
        Call call = new Call();
        call.run();
        call.run();
    }
}
