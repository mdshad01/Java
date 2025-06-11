package Hashing;

import java.util.*;

public class Count_Distinct_Elements {
    public static void main(String[] args) {
        int num[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < num.length; i++) { // T.C = O(n)
            set.add(num[i]);
        }
        System.out.println(set.size());

        // int count = 0; //T.C = O(n^2)
        // for (int i = 0; i < num.length; i++) {
        // boolean isDist = true;
        // for (int j = 0; j < i; j++) {
        // if (num[i] == num[j]) {
        // isDist = false;
        // }
        // }
        // if (isDist) {
        // count++;
        // }
        // }
        // System.out.println(count);
    }

}
