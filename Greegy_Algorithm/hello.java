package Greegy_Algorithm;

import java.util.*;

public class hello {
    public static void main(String[] args) {
        int arr[][] = { { 11, 12, 13 },
                { 17, 18, 90 },
                { 13, 14, 45 },
                { 18, 20, 12 } };
        Arrays.sort(arr, Comparator.comparingInt(o -> o[2]));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.err.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
