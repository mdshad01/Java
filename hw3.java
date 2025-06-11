import java.util.*;

public class hw3 {
    public static void printGreater(int a, int b) {
        if(a > b) {
            System.out.println(a);
        } else if(a < b) {
            System.out.println(b);
        } else if(a == b) {
            System.out.println("Both equal");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        printGreater(a, b);
        sc.close();
    }
    
}
