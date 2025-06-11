package Recursion;

public class febonacciUptoNterm {
    static long  a = 0;
    static long b = 1;
    public static void febo(long n){
        if(n == 0){
            return;
        }
        System.out.println(a);
        long c = a + b;
        a = b;
        b = c;
        febo(n-1);
    }
    public static void main(String[] args) {
       long n = 100;
        febo(n);
    }
}
