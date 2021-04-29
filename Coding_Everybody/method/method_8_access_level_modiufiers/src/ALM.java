class Greeting{
    private static void hi(){
        System.out.println("hello");
    }

    public static void hello(){
        System.out.println("Wow ");
        hi();
    }
}

public class ALM {
    public static void main(String[] args){
        //Greeting.hi();

        Greeting.hello();
    }
}
