public class max_sub_array_sum{
    public static void MaxSubArraySum(int numbers[]) {
        int crSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                crSum = 0;
                for(int k=start; k<=end; k++) {
                    crSum += numbers[k];
                    if(MaxSum < crSum) {
                        MaxSum = crSum;
                    }
                }
                System.out.println("Sum of subarrays : " + crSum);
            }
        }
        System.out.println("Maximun Sum of sub Arrays = "+ MaxSum);
    }
    public static void main(String[] args){
        int numbers[] = {1 ,-2 ,6 ,-1 ,3};
        MaxSubArraySum(numbers);
    }
}
