package Function;

import java.util.*;

public class Binomial_Coefficent{
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        return (n * fact(n-1));
    }
    public static float binCoeff(int n, int r ){
        return (float) fact(n)/(fact(r)*fact(n-r));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n and r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(binCoeff(n,r));;
        sc.close();
    }
}