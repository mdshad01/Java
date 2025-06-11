import java.util.*;

public class Solution {
    public String[] findRelativeRanks(int[] score) { // .....?????????
        int n = score.length;
        Integer[] index = new Integer[n]; // .....????
        for (int i = 0; i < n; i++) {
            index[i] = i; // .....?????????
        }

        Arrays.sort(index, (a, b) -> (score[b] - score[a])); // .....?????????

        String[] result = new String[n];
        for (int i = 0; i < n; ++i) {
            if (i == 0) {
                result[index[i]] = "Gold Medal";
            } else if (i == 1) {
                result[index[i]] = "Silver Medal";
            } else if (i == 2) {
                result[index[i]] = "Bronze Medal";
            } else {
                result[index[i]] = String.valueOf(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] scores = { 10, 3, 8, 9, 4 };
        String[] ranks = solution.findRelativeRanks(scores);
        System.out.println(Arrays.toString(ranks));
    }
}
