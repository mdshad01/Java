package LeetCode;

import java.util.HashMap;

public class Subarray_Sum_Equals_K {
    // TC = O(n^2) SC = O(1)
    public static int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int sub = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == k)
                    sub++;
            }
        }
        return sub;
    }

    public static int subarraySum2(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int prefixSum[] = new int[nums.length];

        prefixSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i];
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (prefixSum[i] == k)
                count++;

            int val = prefixSum[i] - k;
            if (map.containsKey(val)) {
                count += map.get(val);
            }
            map.put(prefixSum[i], map.getOrDefault(prefixSum[i], 0) + 1);
        }
        return count;

    }

    public static int subarraySum3(int[] nums, int k) {
        int n = nums.length;
        int sum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            sum += num;

            if (sum == k)
                count++;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3 };
        // System.out.println(subarraySum3(nums, 3));
        // Generate a long test array
        int n = 1_000_000; // 1 million elements
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i % 100 - 50; // numbers from -50 to 49
        }
        int k = 5;

        // Track start time
        long start = System.nanoTime();

        int result = subarraySum2(nums, k);

        // Track end time
        long end = System.nanoTime();

        // Print results
        System.out.println("Subarray count = " + result);
        System.out.println("Execution time = " + (end - start) / 1_000_000.0 + " ms");
    }
}
