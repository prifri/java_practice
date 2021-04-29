class Print{
    public String delimeter;

    Print(String delimeter){
        this.delimeter = delimeter;
    }

    public void a(){
        System.out.println("a"+this.delimeter+"a");
    }

    public static void b(String delimeter){
        System.out.println("b"+delimeter+"b");
    }
}

public class staticTest {
    public static void main(String[] args){
        Print test = new Print("/");

        test.a();
        Print.b("^");
        //Print.a();

        Print.b("*");
    }
}
