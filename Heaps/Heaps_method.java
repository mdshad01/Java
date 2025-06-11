package Heaps;

import java.util.*;

public class Heaps_method {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) { // T.C = O(log n)
            // add at last index
            arr.add(data);

            int x = arr.size() - 1; // x is child index
            int par = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(par)) { // O(log n)
                // swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
            }

            x = par;
            par = (x - 1) / 2;
        }

        public int peek() { // O(1)
            return arr.get(0);
        }

        public void heapyify(int i) { // O(log n)
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minidx = i;

            if (left < arr.size() && arr.get(minidx) > arr.get(left)) {
                minidx = left;
            }
            if (right < arr.size() && arr.get(minidx) > arr.get(right)) {
                minidx = right;
            }

            if (minidx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx, temp);

                heapyify(minidx);
            }

        }

        public int remove() {
            int data = arr.get(0);

            // swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            // remove last index

            arr.remove(arr.size() - 1);

            heapyify(0); // O(log n)
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(5);
        h.add(8);
        h.add(1);
        h.add(4);
        h.add(9);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
