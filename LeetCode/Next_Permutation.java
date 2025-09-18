package LeetCode;

public class Next_Permutation {
    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void reverse(int[] a, int i, int j){
        while(i < j){
            swap(a,i,j);
            i++;
            j--;
        }
    }
    public static void nextPermutation(int[] A){
        int pivot = -1, n = A.length;

        // Step 1: find the first decreasing element
        for(int i = n-2; i >= 0; i--) {
            if(A[i] < A[i+1]){
                pivot = i;
                break;
            }
        }
        // if no element found reverse the array
        if(pivot == -1) {
            reverse(A, 0, n-1);
            return;
        }

        // Step 2: find element that is greater that pivot and swap with povit 
        for(int i = n-1; i > pivot; i++) {
            if(A[i] > A[pivot]){
                swap(A, pivot, i);
                break;
            }
        }

        // Step 3: reverse the elements after pivot in addseding order 
        reverse(A, pivot+1, n-1);
    }
    public static void print(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.err.print(a[i] + " ");
        }
        System.err.println();
    }

    public static void main(String[] args) {
        // int a[] = {1,2,3,4,8,7,6,5};
        int a[] = {1,2,3};
        nextPermutation(a);

        
    }
}