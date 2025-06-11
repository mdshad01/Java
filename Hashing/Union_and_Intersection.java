package Hashing;

import java.util.*;

// This code has a time complexity of O(n + m) and a space complexity of O(n + m).
public class Union_and_Intersection {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 }; // n
        int arr2[] = { 6, 3, 9, 2, 9, 4 }; // m

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        // Union
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            set1.add(arr2[i]);
        }

        System.out.println("Union = " + set1.size() + set1);

        set1.clear();

        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                set2.add(arr2[i]);
            }
        }

        System.out.println("Intersection = " + set2.size() + set2);
    }
}
