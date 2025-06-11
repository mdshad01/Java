public class error {
    public static void optimizedBubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            boolean swap = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap == false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 , 4 , 5, 6};
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr.length-1-i;j++){
        //         if(arr[j] > arr[j+1]){
        //             //swap
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        optimizedBubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
