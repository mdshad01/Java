package Recursion;

public class OptimizedPowerFun {
    public static int OptmizedPower(int x, int n){
        if(n == 1){
            return x;
        }
        int halfpower = OptmizedPower(x, n/2);
        int halfpowSq = halfpower * halfpower;
        
        if(n%2 != 0){
            halfpowSq = x *halfpowSq;
        }
        return halfpowSq;
    }
    public static void main(String[] args) {
        System.out.println(OptmizedPower(2, 3));
    }
}
