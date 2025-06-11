package Queue_in_java;

import java.util.*;

// T.C = O(n)
// S.C = O(n)
public class Interleave {
    public static void interLeave(Queue<Integer> q) {
        Queue<Integer> fh = new LinkedList<>(); // fh -> first half
        int size = q.size();
        for (int i = 0; i < size / 2; i++) {
            fh.add(q.remove());
        }
        while (!fh.isEmpty()) {
            q.add(fh.remove());

            q.add(q.remove());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            q.add(i);
        }

        interLeave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
    }
}
