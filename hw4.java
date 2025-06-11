import java.util.*;

public class hw4 {
    public static void printCircumference(float r) {
        System.out.println(2 * 3.14 * r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        
        printCircumference(r);
        sc.close();
    }
    
}
