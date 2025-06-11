//import java.util.Scanner;
public class revisionFunction {
    public static boolean nums(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] == arr[i]){
                    return true;
                }
            }
        }
        return false;
    }
    public static int linearSearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int largestNumber(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest value in array is : " + min);
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        System.out.println("Larget value in this array is : "+ +largestNumber(arr));
    }
}
