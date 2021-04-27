
class member {
    int value;

    public void set_value(int value) {
        this.value = value;
    }

    public void set(member m) {
        this.set_value(m.value);
    }

    public int get_value() {
        return value;
    }
}

class array {
    static final int STACK_SIZE = 10;
    member[] array;
    int top = -1;

    public array(){
        array = new member[STACK_SIZE];

        for (int i=0 ; i<STACK_SIZE ; i++)
        {
            array[i] = new member();
        }
    }

    public boolean push(member in) {
        if (top == STACK_SIZE-1)
        {
            return false;
        }

        array[++top].set(in);
        return true;
    }

    public boolean pop(member out) {

        if (top == -1)
        {
            return false;
        }

        out.set(array[top--]);
        return true;
    }

    public void show() {

        System.out.print("count : " + (top+1) + " || ");

        for (int i=0 ; i<=top ; i++)
        {
            System.out.printf("%02d : %2d, ", i, array[i].get_value());
        }
        System.out.println();
    }
}

public class stack {
    static public void main(String[] args) {
        array test = new array();

        test.show();

        member value = new member();

        for (int i= -5; i<10 ; i++)
        {
            value.set_value(i);
            test.push(value);
            test.show();
        }

        while (test.pop(value))
        {
            System.out.println("pop value : " + value.get_value());
            test.show();
        }
    }
}
