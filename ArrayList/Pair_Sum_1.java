package ArrayList;

import java.util.*;

public class Pair_Sum_1 {
    // T.C = O(n^2)
    // public static boolean pairSum(ArrayList<Integer> list, int target) {
    // for (int i = 0; i < list.size(); i++) {
    // for (int j = i + 1; j < list.size(); j++) {
    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }
    // System.out.println();
    // }
    // return false;
    // }
    // two Pointer approch
    // T.C = O(n);
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else if (list.get(lp) + list.get(rp) > target) {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        int target = 5;
        System.out.println(pairSum(list, target));
    }
}
