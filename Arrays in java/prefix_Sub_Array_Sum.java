public class prefix_Sub_Array_Sum {
    // TC = O(n^2)
    public static void prefixSum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[arr.length]; 
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum = 0;
                currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum sub array sum = " + maxSum);
    }
    public static void main(String[] args) {
        int arr[] = {2 , 4, -6, 8, 10};
        prefixSum(arr);
    }
}
