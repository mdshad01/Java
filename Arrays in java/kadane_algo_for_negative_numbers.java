public class kadane_algo_for_negative_numbers {
    public static void kadanes(int numbers[]) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            cs = cs + numbers[i];
            if(cs < 0) {
                cs = Math.max(cs , numbers[i]);
            }
            ms = Math.max(cs , ms);
        }
        System.out.println(ms);
    }
    public static void main(String[] args) {
        int numbers[] = {-2, -3, -4, -2, -1, -10, -5, -3};
        kadanes(numbers);
    }
}
