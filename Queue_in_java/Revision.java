package Queue_in_java;

import java.util.*;

public class Revision {
    // static class Queue {
    // static int arr[];
    // static int size;
    // static int rear;

    // Queue(int n) {
    // arr = new int[n];
    // size = n;
    // rear = -1;
    // }

    // public boolean isEmpty() {
    // return rear == -1;
    // }

    // public void add(int data) {
    // if (rear == size - 1) {
    // System.out.println("Queue is Full");
    // return;
    // }
    // rear++;
    // arr[rear] = data;
    // }

    // public int remove() {
    // if (isEmpty()) {
    // System.out.println("Queue is Empty");
    // return -1;
    // }
    // int front = arr[0];
    // for (int i = 0; i < rear; i++) {
    // arr[i] = arr[i + 1];
    // }
    // rear--;
    // return front;
    // }

    // public int peek() {
    // if (isEmpty()) {
    // System.out.println("Queue is Empty");
    // return -1;
    // }
    // return arr[0];
    // }
    // }

    // static class QueueA {
    // static int arr[];
    // static int size;
    // static int rear;
    // static int front;

    // QueueA(int n) {
    // arr = new int[n];
    // size = n;
    // rear = -1;
    // front = -1;
    // }

    // public boolean isEmpty() {
    // return (front == -1 && rear == -1);
    // }

    // public boolean full() {
    // return (rear + 1) % size == front;
    // }

    // public void add(int data) {
    // if (full()) {
    // System.out.println("Queue is Full");
    // return;
    // }
    // if (front == -1) {
    // front = 0;
    // }
    // rear = (rear + 1) % size;
    // arr[rear] = data;
    // }

    // public int remove() {
    // if (isEmpty()) {
    // System.out.println("Queue is Empty");
    // return -1;
    // }
    // int result = arr[front];
    // if (front == rear) {
    // front = rear = -1;
    // } else {
    // front = (front + 1) % size;
    // }
    // return result;
    // }

    // public int peek() {
    // if (isEmpty()) {
    // System.out.println("Queue is Empty");
    // return -1;
    // }
    // return arr[front];
    // }
    // }

    static class QueueB {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static Node head;
        public static Node tail;

        public boolean isEmpty() {
            return (head == null && tail == null);
        }

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }
    }

    static class QueueC {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove
        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        // peek()
        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }
    }

    static public class Stack1 {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // push
        public void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // pop
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Underflow");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Underflow");
                return -1;
            }
            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void firstNonRepeating(String str) {
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void interLeave(Queue<Integer> q1) {
        Queue<Integer> q2 = new LinkedList<>();

        int size = q1.size();
        for (int i = 0; i < size / 2; i++) {
            q2.add(q1.remove());
        }
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }
    }

    public static void reverse(Queue<Integer> q1) {
        Stack<Integer> s = new Stack<>();
        while (!q1.isEmpty()) {
            s.push(q1.remove());
        }
        while (!s.isEmpty()) {
            q1.add(s.pop());
        }
    }

    static class StackC {
        Deque<Integer> deque = new LinkedList<>();

    }

    public static void main(String[] args) {

    }
}
