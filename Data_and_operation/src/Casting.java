//https://www.youtube.com/watch?v=LeTbH63CpRo&list=PLuHgQVnccGMAIluRRVsC1e79ri-dwnBmR&index=22
public class Casting {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1;
        System.out.println(b);

        int c = (int) 1.1;

        System.out.println(c);

        String f = Integer.toString(c);
        System.out.println(f + ' ' + f.getClass());
    }
}
