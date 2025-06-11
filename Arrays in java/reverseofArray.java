public class reverseofArray {
    public static void reverse(int arr[]){
        int n = arr.length-1; 
        for(int i=0;i<=n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i]; 
            arr[n-i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
