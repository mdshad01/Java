package LeetCode;

// (Q).152

public class Maximum_Product_Subarray {
    // Broute force
    public static int brouteForce(int nums[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int prod = 1;
            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];

                max = Math.max(prod, max);
            }
        }
        return max;
    }

    public static int maxProduct(int nums[]) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            result = Math.max(result, max);
        }
        return result;
    }

    // M2

    public static int subArrayMaxProduct(int nums[]) {
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = nums.length - 1;
        for (int i = 0; i <= n; i++) {
            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;

            prefix = prefix * nums[i];
            suffix = suffix * nums[n - i];
            max = Math.max(max, Math.max(prefix, suffix));

        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, -2, 4 };
        // System.out.println(maxProduct(nums));
        // System.err.println(brouteForce(nums));
        System.err.println(subArrayMaxProduct(nums));
    }
}
