package Greegy_Algorithm;

import java.util.*;

// T.C = O(n)
public class Activity_Sorting {
    public static void main(String[] args) {
        int star[] = { 1, 3, 0, 5, 8, 7 };
        int end[] = { 2, 4, 6, 8, 9, 9 };

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (star[i] >= lastEnd) {
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Maximum number of activites : " + maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
        System.out.println(ans);
    }
}
