package Bit_Manipulation;

public class check_if_a_number_is_power_of_two {
    public static boolean isPowerofTwo(int n){
        return ((n&(n-1)) == 0);
    }
    public static void main(String[] args) {
        System.out.println(isPowerofTwo(16));
    }
}
