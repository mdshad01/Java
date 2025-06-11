package Greegy_Algorithm;

import java.util.*;

public class Revision {
    public static void activitySelection() {
        int start[] = { 0, 1, 3, 5, 5, 8 };
        int end[] = { 6, 2, 4, 7, 9, 9 };

        int activity[][] = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            activity[i][0] = i;
            activity[i][1] = start[i];
            activity[i][2] = end[i];
        }

        Arrays.sort(activity, Comparator.comparingDouble(o -> o[2]));

        ArrayList<Integer> ans = new ArrayList<>();
        int maxAct = 1;
        int lastEnd = activity[0][2];
        ans.add(activity[0][0]);
        for (int i = 1; i < activity.length; i++) {
            if (activity[i][1] >= lastEnd) {
                ans.add(activity[i][0]);
                maxAct++;
                lastEnd = activity[i][2];
            }
        }

        System.out.println("Maximum number of activity = " + maxAct);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }

    public static void fractionalKnapsack() {
        int value[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[value.length][2];

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int cost = 0;
        int capacity = w;
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0]; // ........
            if (capacity >= weight[idx]) {
                capacity -= weight[idx];
                cost += value[idx];
            } else {
                cost += (capacity * ratio[i][1]);
                capacity = 0;
            }
        }

        System.out.println("Final cost = " + cost);
    }

    public static void minAbsValue() {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum absolutr diff of pair : " + minDiff);
    }

    public static void maxLenOfChain() {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));

        int maxChain = 0;
        int chainEnd = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] >= chainEnd) {
                maxChain++;
                chainEnd = pairs[i][0];
            }
        }

        System.out.println("Maximum length of chain : " + maxChain);
    }

    public static void indianCoins() {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };

        Arrays.sort(coins, Comparator.reverseOrder());

        ArrayList<Integer> ans = new ArrayList<>();

        int amount = 9999;
        int count = 0;
        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]) {
                ans.add(coins[i]);
                amount -= coins[i];
                count++;
            }
        }
        System.out.println("Total minimum number of coins : " + count);

        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }

    static public class Job {
        int id;
        int profit;
        int deadline;

        public Job(int i, int d, int p) {
            this.id = i;
            this.profit = p;
            this.deadline = d;
        }
    }

    public static void main(String[] args) {
        Integer jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        Arrays.sort(jobInfo, Comparator.comparingDouble(o -> o[1]));

        ArrayList<Job> ans = new ArrayList<>();

        for (int i = 0; i <= jobInfo.length; i++) {
            ans.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        // int totalProfit = 0;
        // int time;
    }
}
