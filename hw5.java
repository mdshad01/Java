import java.util.*;

public class hw5 {
    public static void printForVote(int age) {
        if(age >= 18) {
            System.out.println("you can vote");
        } else {
            System.out.println("you are not eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        
        printForVote(age);
        sc.close();
    }
    
}
