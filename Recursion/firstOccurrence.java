package Recursion;

public class firstOccurrence {
    // public static void findelement(int a[],int key){
    //     boolean found = false;
    //     for(int i=0;i<a.length;i++){
    //         if(a[i] == key){
    //             System.out.println("key at index : "+i);
    //             found = true;
    //         }
    //     }
    //     if(!found){
    //         System.out.println("Ker not found");
    //         }
    // }
    public static int firstOccu(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccu(arr,key,i+1);

    }
    public static void main(String[] args) {
        int arr[] = {1,4,6,8,5,17,10,43,32};
        System.out.println(firstOccu(arr, 11, 0));
        System.out.println(arr.length);
    }
}
