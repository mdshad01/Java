package hw;

import java.util.*;

public class febo {
    public static void feb(int n) {
        int a = 0, b = 1, c = 0;
        while (n >= 0) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
            n--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        feb(n);
        sc.close();
    }
}
