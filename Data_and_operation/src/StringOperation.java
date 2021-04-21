//https://www.youtube.com/watch?v=y20Fhlseh4w&list=PLuHgQVnccGMAIluRRVsC1e79ri-dwnBmR&index=18

public class StringOperation {
    public static final String Tag = "[[name]]";

    public static void main(String[] args) {
        System.out.println("Hello World".length());
        String Msg = "Hello, " + Tag + " ... bye.";
        System.out.println(Msg.replace(Tag, "abc"));
    }
}
