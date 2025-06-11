package Java_Homework;

import java.util.*;

public class Calculater {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Mutlipluction");
        System.out.println("Press 4 for Division");
        System.out.println("Press 5 for Remender");
        int n = sc.nextInt();

        System.out.print("Enter two number for performing calculation : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("Wrong choice!");
                break;
        }
        sc.close();
    }
}
