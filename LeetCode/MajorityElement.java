package LeetCode;
import java.util.*;

public class MajorityElement {
    public static int mojorityElement(int nums[]){
        int n = nums.length;
        int freq = 1, ans = nums[0];
        Arrays.sort(nums);
        for(int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1]){
                freq++;
            } else {
                freq = 1;
                ans = nums[i];
            }
            if(freq > n/2){
                return ans;
            }
        }
        return -1;
    }

    public static int mojorityElementOptimized(int  nums[]){
        int n = nums.length;
        int freq = 0, ans = 0;
        for(int i = 0; i < n; i++){
            if(freq == 0){
                ans = nums[i];
            }
            if(ans == nums[i]){
                freq++;
            } else {
                freq--;
            }
        }
        // if no guarantee majority element always exists in the array
        int count = 0;
        for (int num : nums) {
            if(ans == num) count++;
        }
        if(count > n/2) return ans;
        else return -1;
        // return ans;
    }
    public static void main(String[] args) {
        // int nums[] = {3,2,3};
        int nums[] = {1,2,3,4};
        // int nums[] = {2,2,1,1,1,2,2,3,3,3,2,2,2};
        System.out.println(mojorityElementOptimized(nums));
    }
}