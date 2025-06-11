package Greegy_Algorithm;

import java.util.*;

public class Activity_Sorting_2 {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 7 };
        int end[] = { 9, 4, 8, 2, 6, 9 };

        Arrays.sort(end);

        int activities[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        // 1st Activities
        int maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum Activities : " + maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
        // for (int i = 0; i < activities.length; i++) {
        // System.out.println(activities[i][0]);
        // }

    }
}
