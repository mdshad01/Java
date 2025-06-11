import java.util.*;

public class hw7 {
    public static void printPower(int x, int n) {
        System.out.println(Math.pow(x,n));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        
        printPower(x,n);
        sc.close();
    }
    
}
