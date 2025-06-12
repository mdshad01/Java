package LeetCode;

import java.util.*;

public class ContainsDublicate {
    static boolean containsDublicate(int nums[]) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 5 };
        System.out.println(containsDublicate(nums));
    }
}
