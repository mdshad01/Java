import java.util.*;
public class binary_search {
    public static int BinarySearch(int numbers[], int key) {
        int start = 0 , end = numbers.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(numbers[mid] == key) {
                return mid;
            } if(numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 1 , 2, 3 , 4 , 5 , 8 , 12 , 14 , 18 , 24 , 28 , 35 , 39 , 45};
        int key = 8;
        System.out.println("Index for key is : " + BinarySearch(numbers,key));
        sc.close();
    }


}
