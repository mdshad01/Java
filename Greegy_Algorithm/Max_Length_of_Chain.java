package Greegy_Algorithm;

import java.util.*;

// T.C = O(n (lon n))
public class Max_Length_of_Chain {
    public static void main(String[] args) {
        int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // O(log n)

        int chainLen = 1;
        int endChain = pairs[0][1];

        for (int i = 1; i < pairs.length; i++) { // O(N)
            if (pairs[i][0] > endChain) {
                chainLen++;
                endChain = pairs[i][1];
            }
        }
        System.out.println("Maximum length of Chain = " + chainLen);
    }
}
