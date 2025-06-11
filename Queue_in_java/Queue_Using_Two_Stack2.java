package Queue_in_java;

// H.W
import java.util.*;

public class Queue_Using_Two_Stack2 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // add() -> T.C = O(1)
        public void add(int data) {
            s1.push(data);
        }

        // remove() -> T.C = O(n)

        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int dequeue = s2.pop();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return dequeue;
        }

        // peek -> T.C = O(n)
        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int peek = s2.peek();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return peek;
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
