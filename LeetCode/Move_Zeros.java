package LeetCode;
public class Move_Zeros {
    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int currP = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] != 0){
                nums[currP] = nums[i];
                currP++;
            }
        }
        while(currP < n){
            nums[currP] = 0;
            currP++;
        }
    }
    public static void main(String[] args) {
        int nums[] = {4,0,2,0,3};
        moveZeroes(nums);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
