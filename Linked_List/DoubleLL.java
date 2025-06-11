package Linked_List;

public class DoubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // print
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            addFirst(data);
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // remove First
    public int removeFirst() {
        if (size == 0) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            size = 0;
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;

        return val;
    }

    // remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("DLL is enpty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            size = 0;
            int val = tail.data;
            head = tail = null;
            return val;
        }
        Node prev = head;
        int val = tail.data;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // reverse
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(5);
        dll.print();

        dll.reverse();
        dll.print();
    }
}
