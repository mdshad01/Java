package hw;

// import java.util.Scanner;

public class Reverse {
    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return n * fact(n - 1);
    }

    public static float binomialCoff(int n, int r) {
        return (float) fact(n) / (fact(n - r) * fact(r));
    }

    public static boolean isPrime(int n) {
        // boolean prime = true;
        // for (int i = 2; i < n; i++) {
        // if (n % i == 0) {
        // prime = false;
        // break;
        // }
        // }
        // if (prime) {
        // System.out.println(n + " is a prime number");
        // } else {
        // System.out.println(n + " is not a prime number");
        // }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void binToDec(int binary) {
        int decimal = 0;
        int myNumber = binary;
        int i = 0;
        while (binary > 0) {
            int rem = binary % 10;
            decimal += rem * Math.pow(2, i);
            binary = binary / 10;
            i++;
        }
        System.out.println("Decimal of binary" + myNumber + " is :" + decimal);
    }

    public static void decToBin(int decimal) {
        int binary = 0, i, rem, myNumber;
        myNumber = decimal;
        i = 0;
        while (decimal > 0) {
            rem = decimal % 2;
            binary += rem * Math.pow(10, i);
            decimal /= 2;
            i++;
        }
        System.out.println("Binary of " + myNumber + " is: " + binary);
    }

    public static int linearSearch(int arr[], int key) {
        int i = 0;
        while (i < arr.length) {
            if (key == arr[i]) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static int binarySearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArray(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void pairsOfArray(int arr[]) {
        int tp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs : " + tp);
    }

    public static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void maxSubArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                System.out.print(currSum + " ");
                maxSum = Math.max(maxSum, currSum);
            }
            System.out.println();
        }
        System.out.println("Maximum subarray sum : " + maxSum);
    }

    public static void prefixSum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];

        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (currSum > maxSum) {
                    maxSum = Math.max(currSum, maxSum);
                }
            }
        }
        System.out.println("MAximum subarray sum : " + maxSum);
    }

    public static void kadensAlgo(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum sub array sum : " + maxSum);
    }

    public static void prefixSum2(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i] + prefix[i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(currSum, maxSum);
            }

        }
        System.out.println("Maximum sub array sum : " + maxSum);
    }

    public static int binarySearch2(int arr[], int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void printSunArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void subArraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currSum = 0;
                for (int k = i; k <= j; k++) {
                    currSum += arr[k];
                }
                if (currSum > maxSum) {
                    maxSum = Math.max(maxSum, currSum);
                }
            }
        }
        System.out.println("Maximum sub array : " + maxSum);
    }

    public static void trapWater(int arr[]) {
        int n = arr.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }
        int total = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            int height = waterLevel - arr[i];
            total += height;
        }
        System.out.println("Maximum water store is = " + total);
    }

    public static int buyAndSell(int price[]) {
        int buyPrice = Integer.MAX_VALUE; // infinit
        int maxProfit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }
            System.out.println(swap);
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        // int ts = 0;
        // for (int i = 1; i < arr.length; i++) {
        // int min = i;
        // for (int j = i - 1; j >= 0; j--) {
        // if (arr[min] < arr[j]) {
        // int temp = arr[j];
        // arr[j] = arr[min];
        // arr[min] = temp;
        // min = j;
        // ts++;
        // }
        // }
        // }
        // System.out.println(ts);

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1; // 0
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insert
            arr[prev + 1] = curr;
        }
    }

    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
    }

    public static void sparceMatrix(int sparce[][]) {
        int n = sparce.length - 1;
        int startRow = 0;
        int startCol = 0;
        int endRow = n;
        int endCol = n;

        while (startRow <= endRow || startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(sparce[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(sparce[i][endCol] + " ");
            }
            // bouuto,
            for (int j = endCol - 1; j >= startCol; j--) {
                System.out.print(sparce[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(sparce[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static int diagonalSum(int arr[][]) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j || i + j == n - 1) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static boolean stairCaseSearch(int arr[][], int key) {
        int i = 0, j = arr[0].length - 1;

        while (i < arr.length && j >= 0) {
            if (arr[i][j] == key) {
                System.out.println("Element was found at index (" + i + " , " + j + ")");
                return true;
            } else if (arr[i][j] > key) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println("Key was not found!");
        return false;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter value of n : ");
        // int n = sc.nextInt();
        // int r = sc.nextInt();
        // System.out.println(binomialCoff(n, r));
        // System.out.println(isPrime(7));
        // primeInRange(n);
        // binToDec(n);
        // decToBin(n);
        // int arr[] = { 5, 4, 1, 3, 2, 1, 1, 7, 9, 20, 11, 13, 7, 9 };
        // int key = 7,5;
        // System.out.println(binarySearch(arr, key));
        // printArray(arr);
        // reverseArray(arr);
        // printArray(arr);
        // pairsOfArray(arr);
        // subArray(arr);
        // maxSubArraySum(arr);
        // prefixSum(arr);
        // kadensAlgo(arr);
        // System.out.println(binarySearch2(arr, 4));
        // printSunArray(arr);
        // subArraySum(arr);
        // prefixSum2(arr);
        // trapWater(arr);
        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        // System.out.println(buyAndSell(prices));
        // selectionSort(arr);
        // insertionSort(arr);
        // int sparce[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
        // 14, 15, 16 } };
        // sparceMatrix(sparce);
        // countingSort(arr);
        // printArray(arr);
        // System.out.println(diagonalSum(sparce));
        // stairCaseSearch(sparce, 8);
    }
}
