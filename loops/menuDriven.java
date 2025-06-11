package loops;

import java.util.Scanner;

public class menuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice 0 or 1 : ");
        int n = sc.nextInt();
        switch(n){
            case 0:
                break;
            case 1:
                System.out.println("Enter Student marks : ");
                int marks = sc.nextInt();
                if(marks >= 90){
                    System.out.println("This is Good");
                }
                else if(marks <= 89 && marks >= 60){
                    System.out.println("This is also Good");
                }
                else if(marks <= 59 && marks >=0){
                    System.out.println("This is good as well");
                }
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }
}
