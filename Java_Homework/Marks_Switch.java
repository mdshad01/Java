package Java_Homework;

import java.util.Scanner;

public class Marks_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("Press 1 to Enter marks of student: ");
        System.out.println("Press 0 to Exit: ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.print("Enter marks of student: ");
                int marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks <= 89 && marks >= 60) {
                    System.out.println("This is also Good");
                } else {
                    System.out.println("This is Good as well");
                }
                break;
            case 2:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}
