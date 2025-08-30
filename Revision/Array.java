package Revision;

import java.util.Scanner;

public class Array {
    // A function taking user input in an array and print output

    public static void arrayInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int number[] = new int[size];

        System.out.print("Enter all element of array : ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Output of an array : ");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
        sc.close();
    }

    // Linear search array

    public static void linearSearch(int key) {
        int arr[] = { 4, 8, 2, 6, 9 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println(key + " found at index " + i);
                return;
            }

        }
        System.out.println(key + " is not exist in the Array");
    }

    // Binary search (Binary serach always work on shorted array)

    public static int binarySearch(int key) {
        int arr[] = { 1, 2, 3 };
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Largest number in an array

    public static void findLargest() {
        int arr[] = { 10, 20, 36, 89, 12, 8, 43, 98 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max + " is the Largest number in this array.");
    }

    public static void revreseArray() {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int n = arr.length - 1;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i];
            arr[n - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // linearSearch(7);
        // System.out.println(binarySearch(3));
        // findLargest();
        revreseArray();
    }
}
