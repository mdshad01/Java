package LeetCode;

import java.util.*;

public class TwoSum {
    public static List<Integer> twoSum(int nums[], int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int l = 0, r = n - 1;
        while (l < r) {
            if (nums[l] + nums[r] == target) {
                ans.add(l);
                ans.add(r);
            } else if (nums[l] + nums[r] < target) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }

    // T.C = O(n^2)
    public int[] twoSum2(int[] nums, int target) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    ans.add(i);
                    ans.add(j);
                }
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }

    // Optimized O(n)
    public static int[] twoSumOpt(int nums[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int sec = target - first;
            if (map.containsKey(sec)) {
                return new int[] { map.get(sec), i };
            }
            map.put(first, i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        // System.out.println(twoSum(nums, target));
        int ans[] = twoSumOpt(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
