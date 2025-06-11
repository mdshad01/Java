import java.util.*;

public class cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();
        sc.close();
        /*
        1 -> a+b;
        2 -> a-b;
        3 -> a*b;
        4 -> a/b;
        5 -> a%b;
         */
        switch(operator) {
            case 1: System.out.println(a+b);
            break;
            case 2: System.out.println(a-b);
            break;
            case 3: System.out.println(a*b);
            break;
            case 4: if(b == 0) {
                System.out.println("incorrect");
            } else {
                System.out.println(a/b);
            }
            break;
            case 5: if(b == 0) {
                System.out.println("incorrect");
            } else {
                System.out.println(a%b);
            }
            break;
        }
    }
}