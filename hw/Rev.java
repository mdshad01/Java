package hw;

import java.util.*;

public class Rev {
    static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int binarySerach(int arr[], int key) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }
        return -1;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Rev r = new Rev();
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int n = sc.nextInt();
        // System.out.println(fact(n));
        // sc.close();

        int arr[] = { 1, 3, 7, 9, 12 };
        int key = 3;
        System.out.println(binarySerach(arr, key));

    }
}
