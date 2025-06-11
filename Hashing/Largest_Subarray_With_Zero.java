package Hashing;

import java.util.*;

public class Largest_Subarray_With_Zero {
    public static void main(String[] args) { // T.C = O(n)
        int arr[] = { 15, -2, 2, -8, 1, 7, 10 };

        HashMap<Integer, Integer> map = new HashMap<>();
        int length = 0;
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                length = Math.max(length, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }
        System.out.println("Maximum sub array length  = " + length);
    }
}
