package ArrayList;

import java.util.*;

public class WaterProblem {
    // brute force
    // T.C = O(n^2)
    public static int storeWater(ArrayList<Integer> list) {
        int maxWater = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int water = height * width;
                maxWater = Math.max(maxWater, water);
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));

        System.out.println(storeWater(list));
    }
}
