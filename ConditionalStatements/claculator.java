package ConditionalStatements;

import java.util.Scanner;

public class claculator {
    public static void calculator(int n,int x,int y){
        switch(n){
            case 1:
                System.out.println(x+y);
                break;
            case 2:
                System.out.println(x-y);
                break;
            case 3:
                System.out.println(x*y);
                break;
            case 4:
                if(y == 0){
                    System.out.println("Invalid division");
                }
                else{
                    System.out.println((float)x/y);
                }
                break;
            case 5:
                if(y == 0){
                    System.out.println("Invalid division");
                }
                else{
                    System.out.println(x%y);
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for Multiplication");
        System.out.println("Enter 4 for Division");
        System.out.println("Enter 5 for Modulo");
        int n = sc.nextInt();
        calculator(n,x,y);
        sc.close();
    }
}
