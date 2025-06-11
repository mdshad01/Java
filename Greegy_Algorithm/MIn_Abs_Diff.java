package Greegy_Algorithm;

import java.util.*;

//  T.C = O(n(log n))
public class MIn_Abs_Diff {
    public static void main(String[] args) {
        int A[] = { 4, 1, 8, 7 };
        int B[] = { 2, 3, 6, 5 };

        Arrays.sort(A); // O(log n)
        Arrays.sort(B); // O(log n)

        int minDiff = 0;

        for (int i = 0; i < A.length; i++) { // O(n)
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Min absolute diff of pair = " + minDiff);
    }
}
