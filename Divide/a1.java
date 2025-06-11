package Divide;

//import java.util.Scanner;

public class a1 {
    static int power(int a,int n){
        if(n == 0){
            return 1;
        }
        int halfpower = power(a,n/2);
        int halfpowerSq = halfpower * halfpower;
        if(n%2 != 0){
            halfpowerSq = a * halfpowerSq;
        }
        return halfpowerSq;
    }
    public static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a + " , " + b);
    }
    static int addOne(int n){
        return -(~n);
    }

    public static void main(String[] args) {
        for(int i=0;i<4;++i){
            System.out.println(i);
        }
    }
}

