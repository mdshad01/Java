package Recursion;
// Tc -> O(2^n)  Sc ->O(n)
public class Fibonacci {
    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int fNm2 = fib(n-2);
        int fNm1 = fib(n-1);
        int fN = fNm1 + fNm2;
        return fN;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
