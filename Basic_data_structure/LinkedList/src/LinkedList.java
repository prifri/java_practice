
class member{
    int value;

    public void set_value(int value){
        this.value = value;
    }

    public void set(member in_value){
        set_value(in_value.value);
    }

    public int get_value(){
        return value;
    }

    public boolean compare(member target)
    {
        return this.value == target.value;
    }
}

class Linked_List {

    private class Node{
        member m;
        Node next;
        Node before;

        public Node(member in_value){
            m = new member();
            m.set(in_value);
            next = null;
            before = null;
        }
    }

    Node head = null;
    Node tail = null;
    int node_cnt = 0;

    private boolean isEmpty() {
        return head == null;
    }

    public void addFirst(member in_m) {

        Node newNode = new Node(in_m);

        if (!isEmpty())
        {
            newNode.next = head;

            head.before = newNode;
        }
        else
        {
            newNode.next = null;
            tail = newNode;
        }

        newNode.before = null;

        head = newNode;

        node_cnt++;
    }

    public void addLast(member in_m) {
        Node newNode = new Node(in_m);

        if (isEmpty())
        {
            addFirst(in_m);
            return;
        }

        tail.next = newNode;

        newNode.next = null;
        newNode.before = tail;

        tail = newNode;

        node_cnt++;
    }

    private Node searchNodeFromIdx(int idx) {
        Node target;

        if (idx < node_cnt/2)
        {
            target = this.head;
            int cnt = 1;
            while (cnt++ < idx)
            {
                target = target.next;
            }
        }
        else
        {
            target = this.tail;

            int cnt = node_cnt;
            while (cnt-- > idx)
            {
                target = target.before;
            }
        }

        return target;
    }

    private Node searchNodeFromMember(member in_m) {
        Node target = this.head;

        while (target != null)
        {
            if (target.m.compare(in_m))
            {
                return target;
            }
            target = target.next;
        }

        return null;
    }

    public void addMid(member in_m, int idx) {
        if (idx <= 0)
        {
            return;
        }

        if (isEmpty() || idx == 1)
        {
            addFirst(in_m);
            return;
        }

        if (node_cnt < idx)
        {
            addLast(in_m);
            return;
        }

        Node target = searchNodeFromIdx(idx);

        Node newNode = new Node(in_m);
        newNode.next = target;
        newNode.before = target.before;

        if (target.before != null)
        {
            target.before.next = newNode;
        }

        target.before = newNode;

        node_cnt++;
    }

    public boolean search(member in_m) {
        Node target = searchNodeFromMember(in_m);

        return target != null;
    }

    public void remove(member in_m) {
        Node target = searchNodeFromMember(in_m);

        if (target == null)
        {
            return;
        }

        if (target.before != null) {
            target.before.next = target.next;
        }
        else
        {
            head = target.next;
        }

        if (target.next != null)
        {
            target.next.before = target.before;
        }
        else
        {
            tail = target.before;
        }

        node_cnt--;
    }

    public void cleanup() {
        Node target = this.head;

        while (target != null)
        {
            Node next = target.next;
            target.next = null;
            target.m = null;
            target = next;
        }
        this.head = null;
        this.tail = null;
        node_cnt = 0;
    }

    public void show() {
        Node target = this.head;

        int cnt = 0;
        while (target != null)
        {
            cnt++;

            System.out.print("("+ cnt +")" + target.m.get_value() + "->");
            target = target.next;
        }

        System.out.println("(end)");
    }
}

public class LinkedList {
    public static void main(String[] args){
        Linked_List test = new Linked_List();

        System.out.println("Empty show");
        test.show();

        System.out.println("AddFirst test");
        member value = new member();

        for (int i=-5 ; i<5 ; i++)
        {
            value.set_value(i);
            test.addFirst(value);
            test.show();
        }

        System.out.println("Remove test");
        for (int i=-5 ; i<5 ; i++)
        {
            value.set_value(i);
            test.remove(value);
            test.show();
        }

        System.out.println("AddLast test");
        for (int i=-5 ; i<5 ; i++)
        {
            value.set_value(i);
            test.addLast(value);
            test.show();
        }

        test.cleanup();

        System.out.println("AddMid test");
        for (int i=0 ; i<10 ; i++)
        {
            value.set_value(i);
            test.addMid(value, i/2+1);
            test.show();
        }

        System.out.println("search test");
        for (int i=-5 ; i<5 ; i++)
        {
            value.set_value(i);
            if (test.search(value))
            {
                System.out.println("Search Done " + i);
            }
            else
            {
                System.out.println("Search Fail " + i);
            }
        }
    }
}
