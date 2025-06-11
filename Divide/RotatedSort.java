package Divide;
//Time Compelxity -> O(n)
public class RotatedSort {
    public static int search(int arr[], int si, int ei, int tar){
        if(si > ei){
            return -1;
        }

        int mid = si +(ei-si)/2;
        if(arr[mid] == tar){
            return mid;
        }
        // Case 1 -> mid on line 1
        if(arr[si] <= arr[mid]){ // Inportant
            // case a -> Left
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr,si,mid-1,tar);
            } // case b -> Right
            else{
                return search(arr,mid+1,ei,tar);
            }
        } // Case 2 -> mid on Line 2
        else{ // Case c -> right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr,mid+1,ei,tar);
            }
            else{
                return search(arr,si,mid-1,tar);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = search(arr,0,arr.length-1,target);
        System.out.println(index);
    }
}
