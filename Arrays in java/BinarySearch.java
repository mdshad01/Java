public class BinarySearch {
    public static int FindKey(int arr[], int key){
        int start = 0, end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] < key){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,20,40,55,65,76,78,89};
        System.out.println(FindKey(arr,78));
    }
}
