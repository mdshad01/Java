import java.util.*;

public class Hwa {
    public static void number(int n) {
        if(n % 2 == 0) {
            System.out.println(n + " is Even number");
        } else {
            System.out.println(n + " is Not a Even number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        number(n);
        sc.close();
    }
}
