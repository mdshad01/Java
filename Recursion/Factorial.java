package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int Fact(int n){
        if(n == 0){
            return 1;
        }
        int factNm1 = Fact(n-1);
        int factN = n * factNm1;
        System.out.print(factN+" ");
        return factN;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you want to print the series : ");
        int n = sc.nextInt();
        Fact(n);
        //System.out.println("Factorial of "+n+" is equal to : "+Fact(n));
        sc.close();
    }
}
