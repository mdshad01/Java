package Queue_in_java;

public class LinkedList_Queue {
    static public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        public static Node head = null;
        public static Node tail = null;

        public boolean isEmpty() {
            return head == null & tail == null;
        }

        // add
        // T.C = O()
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // remove
        // T.C = O()
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) { // .....
                head = tail = null; // ....
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        // T.C = O()
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
