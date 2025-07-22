package LeetCode;

public class AllCombinations {
    static void maxAndMin(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Max = " + max + " , " + "MIN = " + min);
    }

    static void allCombinations(int arr[], int r) {
        for(int i=0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 4, 1, 9 };
        maxAndMin(arr);
    }
}
