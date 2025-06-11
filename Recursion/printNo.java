package Recursion;

import java.util.Scanner;

public class printNo {

    public static void ReverseNo(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n+" ");
        ReverseNo(n-1);
    }

    public static void printNo1toN(int n){
        if(n == 1){
            System.out.print(" "+1+"  ");
            return;
        }
        System.out.print(-n+" ");
        printNo1toN(n-1);
        System.out.print(n+"  ");
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        printNo1toN(n);
        sc.close();
    }
}
