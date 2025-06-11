package Stack;

import java.util.*;

// T.C = O(n)
public class Next_Grater_Element {
    public static void nextGrater(int arr[], int grater[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {

            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                grater[i] = -1;
            } else {
                grater[i] = arr[s.peek()];
            }
            s.push(i);
        }
    }

    public static void print(int grater[]) {
        for (int i = 0; i < grater.length; i++) {
            System.out.print(grater[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        int grater[] = new int[arr.length];

        nextGrater(arr, grater);
        print(grater);

    }
}
