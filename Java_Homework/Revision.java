package Java_Homework;

import java.util.*;

public class Revision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter array element: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean assen = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                assen = false;
                break;
            }
        }
        if (assen) {
            System.out.println("Array sorted in assending order.");
        } else {
            System.out.println("Array is not sorted in assending order.");
        }
        sc.close();
    }
}
