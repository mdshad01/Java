class Product_of_Array_Except_Self {

    // TC = O(n^2)
    public static int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                prod *= nums[j];
            }
            result[i] = prod;
        }
        return result;
    }

    // Optmized approch
    // TC = O(n)
    public static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];

        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int suffix = 1;
        for (int i = n - 2; i >= 0; i--) {
            suffix *= nums[i + 1];
            result[i] *= suffix;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        int[] result = productExceptSelf2(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}