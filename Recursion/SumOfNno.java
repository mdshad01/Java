package Recursion;

public class SumOfNno {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int sum = sum(n-1);
        sum = n + sum;
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first "+n+" natural numbers equal to : "+sum(5));
    }
}
