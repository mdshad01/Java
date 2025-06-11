package Function;

import java.util.Scanner;

public class evenOrOdd {
    public static void check(int n){
        if(n%2 == 0){
            System.out.println(n + " is Even");
        }
        else{
            System.out.println(n + " is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        check(n);
        sc.close();
    }
}
