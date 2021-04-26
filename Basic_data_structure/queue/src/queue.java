
class member {
    int value;

    public void set(int in_value) {
        value = in_value;
    }

    public void set(member m) {
        set(m.value);
    }

    public int get() {
        return value;
    }
}

class array {
    static final int QUEUE_SIZE = 10;
    member[] array;
    int last = 0;
    int first = 0;

    public array() {
        array = new member[QUEUE_SIZE];
        for (int i=0 ; i<QUEUE_SIZE ; i++)
        {
            array[i] = new member();
        }
    }

    public boolean push(member set_value) {
        // .. f .. l ..
        if (first <= last)
        {
            if (last < QUEUE_SIZE-1) {
                array[last].set(set_value);
                last++;
                return true;
            }

            if (first != 0)
            {
                array[last].set(set_value);
                last = 0;
                return true;
            }

            return false;
        }

        //  .. l .. f ..

        if (last+1 != first)
        {
            array[last++].set(set_value);
            return true;
        }
        return false;
    }

    public boolean pop(member out_value) {

        if (first == last)
        {
            return false;
        }

        out_value.set(array[first]);

        if (first < last)
        {
            first++;
        }
        else
        {
            if (first+1 != QUEUE_SIZE-1)
            {
                first++;
            }
            else
            {
                first = 0;
            }
        }

        return true;
    }

    public boolean search(int value) {
        if (first == last)
        {
            return false;
        }

        // .. f .. l ..
        if (first < last) {
            for (int i=first ; i<last ; i++){
                if (value == array[i].get())
                {
                    return true;
                }
            }
        }

        for (int i=first ; i<QUEUE_SIZE ; i++)
        {
            if (value == array[i].get())
            {
                return true;
            }
        }

        for (int i=0 ; i<= last ; i++)
        {
            if (value == array[i].get())
            {
                return true;
            }
        }

        return false;
    }

    public void show() {

        System.out.println("first : " + first + ", last : " + last);

        if (first == last)
        {
            return;
        }

        // .. f .. l ..
        if (first < last) {
            for (int i=first ; i<last ; i++)
            {
                System.out.printf("%2d : %d,", i, array[i].get());
            }
            System.out.println();
            return;
        }

        for (int i=first ; i<QUEUE_SIZE ; i++)
        {
            System.out.printf("%2d : %d,", i, array[i].get());
        }

        for (int i=0 ; i<= last ; i++)
        {
            System.out.printf("%2d : %d,", i, array[i].get());
        }
        System.out.println();
    }

    @SuppressWarnings("StatementWithEmptyBody")
    public void clean() {
        member temp = new member();

        while (pop(temp));
    }
}

public class queue {
    static public void main(String[] args) {

        //
        array test = new array();
        test.show();

        //
        member value = new member();

        //
        value.set(1);
        test.push(value);
        value.set(2);
        test.push(value);
        value.set(3);
        test.push(value);
        value.set(4);
        test.push(value);
        test.show();

        test.clean();

        test.show();

        //
        for (int i=-5; i<10 ; i++) {
            value.set(i);
            if (!test.push(value))
            {
                break;
            }
        }

        test.show();

        while (test.pop(value))
        {
            System.out.println("pop " + value.get());
            test.show();
        }

        if (test.search(10))
        {
            System.out.println("bug");
            return;
        }

        value.set(3);
        test.push(value);

        if (test.search(10))
        {
            System.out.println("bug");
            return;
        }

        if (!test.search(3))
        {
            System.out.println("bug");
            return;
        }

        value.set(4);
        test.push(value);
        value.set(5);
        test.push(value);
        value.set(6);
        test.push(value);

        if (!test.search(5))
        {
            System.out.println("bug");
        }
    }
}
