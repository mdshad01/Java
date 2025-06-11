package ArrayList;

import java.util.*;

// Container with most water
// 2 Pointer Approach
//T.C = O(n)
public class waterProblem2 {
    public static int stroeWater(ArrayList<Integer> height) {
        // Calculate area
        int lp = 0;
        int rp = height.size() - 1;
        int maxWater = 0;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);
            // Condition
            if (height.get(lp) < height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<Integer>(Arrays.asList(1, 8, 6, 2, 5, 4, 8, 3, 7));
        System.out.println(stroeWater(height));
    }
}
