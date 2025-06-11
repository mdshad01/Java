package Linked_List;

public class Revision {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (size == 0) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // print

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // last

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        if (size == 0) {
            head = tail = newNode;
            return;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        tail = newNode;
    }

    // add -><-

    public void add(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    // remove first

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            size = 0;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove Last
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            size = 0;
            int val = head.data;
            head = tail = null;
            return val;
        }
        Node temp = head;
        int val = tail.data;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }
    // iterative search

    public int itrSearch(int key) {
        Node temp = head;
        // for (int i = 0; i < size; i++) {
        // if (temp.data == key) {
        // return i;
        // }
        // temp = temp.next;
        // }
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Revision ll = new Revision();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addFirst(0);
        ll.print();
        ll.add(4, 4);
        ll.add(-1, 0);
        ll.print();
        System.out.println("Remove " + ll.removeFirst());
        ll.print();
        System.out.println("size of Linkrd List: " + size);
        System.out.println("Remove " + ll.removeLast());
        ll.print();
        System.out.println("size of Linkrd List: " + size);
        System.out.println(ll.itrSearch(3));
    }
}
