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

    // Pairs of array
    public static void pairsOfArray() {
        int arr[] = { 2, 4, 6, 8, 10 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }

    // Print sub array
    public static void printSubArray() {
        int arr[] = { 2, 4, 6, 8, 10 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.err.print(" " + arr[k]);
                }
                System.out.print(", ");
            }
            System.out.println();
        }
    }

    // Maximum sub array sum

    public static void maxSubArraySum() {
        int arr[] = { 1, 5, -7, 6, 2, -5 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Maximum sub array aum = " + max);
    }

    // Perfix sub array
    public static void prefixSubArraySum() {
        int arr[] = { 1, 5, -7, 16, -2, -5 };
        int max = Integer.MIN_VALUE, curr = 0;

        int prefix[] = new int[arr.length];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            prefix[i] = sum;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                curr = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (curr > max) {
                    max = curr;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }

        System.out.println();
        System.out.println("Maximum sub array sum = " + max);

        // int prefix2[] = new int[arr.length];

        // prefix2[0] = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        // prefix2[i] = prefix2[i - 1] + arr[i];
        // }
        // System.out.println();
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(prefix2[i] + " ");
        // }

    }

    public static void main(String[] args) {
        // linearSearch(7);
        // System.out.println(binarySearch(3));
        // findLargest();
        // revreseArray();
        // pairsOfArray();
        // printSubArray();
        maxSubArraySum();
        prefixSubArraySum();
    }
}
