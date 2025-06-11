package Queue_in_java.HW;

import java.util.*;

public class GenerateBinaryNumbers {
    // public static void generateBinary(int n) {
    // Queue<String> queue = new LinkedList<>();

    // // Queue mein pehla binary number add karte hain
    // queue.add("1");

    // while (n-- > 0) {
    // // Queue ke front ka number retrieve karte hain aur print karte hain
    // String s1 = queue.peek();
    // queue.remove();
    // System.out.println(s1);

    // // Agla do binary numbers generate karte hain aur unhe queue mein add karte
    // hain
    // String s2 = s1; // s1 ka copy
    // queue.add(s1 + "0");
    // queue.add(s2 + "1");
    // }
    // }
    public static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();

        q.add("1");

        while (n-- > 0) {
            String s1 = q.peek();
            q.remove();
            System.out.print(s1 + " ");

            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        generateBinary(n);
        sc.close();
    }
}
