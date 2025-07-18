package Hashing;

import java.util.*;

public class ContainsDublicate {
    static boolean containsDublicate(int nums[]) {
        Set<Integer> seen = new HashSet<>();
        for (Integer num : nums) {
            if (!seen.add(num))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 5, 7, 2, 8, 4 };
        System.out.println(containsDublicate(nums));
    }
}