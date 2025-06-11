import java.util.*;

public class hw6 {
    public static void printInfinite(int n) {
        int i=1;
        do {
            System.out.println(i);
            i++;
        } while(i>=1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printInfinite(n);
        sc.close();
    }
    
}
