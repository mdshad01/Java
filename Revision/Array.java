package Revision;

import java.util.*;

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

    // O(n)
    public static void kadanesAlgo() {
        // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int arr[] = { 1, 5, -7, 16, -2, -5 };
        int max = arr[0];
        int curr = arr[0];
        for (int i = 1; i < arr.length; i++) {
            curr = Math.max(arr[i], curr + arr[i]);
            max = Math.max(curr, max);
        }
        System.out.println("Maxiumn sub array sum = " + max);
    }

    // Maximum sub array product

    public static int maxProduct(int nums[]) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);
            result = Math.max(result, max);
        }
        return result;
    }

    // M2

    public static int subArrayMaxProduct(int nums[]) {
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        int n = nums.length - 1;
        for (int i = 0; i <= n; i++) {
            if (prefix == 0)
                prefix = 1;
            if (suffix == 0)
                suffix = 1;

            prefix = prefix * nums[i];
            suffix = suffix * nums[n - i];
            max = Math.max(max, Math.max(prefix, suffix));

        }
        return max;
    }

    // Tarpping rainwater

    public static void trappingWater() {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int waterTrap = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            waterTrap += waterLevel - height[i];
        }
        System.out.println("Total trapwater = " + waterTrap);
    }

    // M2 Using arraylist
    public static void trappingWater2() {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int n = height.length;
        int lp = 0, rp = n - 1, lmax = 0, rmax = 0;
        int trapwater = 0;
        while (lp < rp) {
            lmax = Math.max(height[lp], lmax);
            rmax = Math.max(height[rp], rmax);

            if (lmax < rmax) {
                trapwater += lmax - height[lp];
                lp++;
            } else {
                trapwater += rmax - height[rp];
                rp--;
            }
        }
        System.out.println("maximum trapping water = " + trapwater);
    }

    public static void main(String[] args) {
        // linearSearch(7);
        // System.out.println(binarySearch(3));
        // findLargest();
        // revreseArray();
        // pairsOfArray();
        // printSubArray();
        // maxSubArraySum();
        // prefixSubArraySum();
        // kadanesAlgo();
        trappingWater();
        trappingWater2();
    }
}
