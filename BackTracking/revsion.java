package BackTracking;

public class revsion {
    public static void changeArr(int arr[], int i, int val){
        if(i == arr.length){
            printArr(arr);
            return;
        }
        arr[i] = val;
        changeArr(arr,i+1,val+1);
        arr[i] = arr[i] - 2;
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // public static void printSubString(String str, String sub, int i){
    //     if(i == str.length()){
    //         if(sub.length() == 0){
    //             System.out.print("Null");
    //         }
    //         else{
    //             System.out.println(sub);
    //         }
    //         return;
    //     }
    //     printSubString(str,sub+str.charAt(i),i+1);
    //     printSubString(str,sub,i+1);
    // }
    public static void printsubString(String str, String ans, int i){
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        printsubString(str,ans+str.charAt(i),i+1);
        printsubString(str, ans, i+1);
    }
    public static void main(String[] args) {
        printsubString("abc","",0);
    }
}
