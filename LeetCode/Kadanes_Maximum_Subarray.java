package LeetCode;

// (Q).53
public class Kadanes_Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr = nums[0];

        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i], curr + nums[i]);
            max = Math.max(curr, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubArray(nums));

    }
}
