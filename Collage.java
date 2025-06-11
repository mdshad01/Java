import java.util.Scanner;

public class Collage {
    public static boolean checkPalindrome(int n){
        int r,sum = 0;
        int t = n;
        while(n>0){
            r = n%10;
            sum = sum * 10 + r;
            n = n/10; 
        }
        if(t == sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(checkPalindrome(n));
        sc.close();
    }
}
