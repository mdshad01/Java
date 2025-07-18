package Hashing;

import java.util.*;

public class Subarray_Sum_Equal_k {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -10, 10 };
        int k = 10;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;

        map.put(0, 1);
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            } else {
                map.put(sum, map.getOrDefault(map.get(sum), 0) + 1);
            }
        }
        System.out.println(ans);
    }
}
