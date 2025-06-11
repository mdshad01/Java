package ArrayList;

import java.util.*;

// T.C = O(n);
public class Pair_Sum_2 {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp = -1;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;
        while (lp != rp) {
            // Case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            // Case 2
            else if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            }
            // Case 3
            else {
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(11, 15, 6, 9, 10));
        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}
