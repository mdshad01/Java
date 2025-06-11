import java.util.*;

public class function1 {
    public static int printSum(int a, int b) {
        int sum = a+b;
        return sum; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = printSum(a, b);
        System.out.println("sum of two numbers = "+ sum);
        sc.close();
    }
}