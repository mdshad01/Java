// import java.util.Scanner;

public class z1 {
    public static int avg(int a, int b, int c){
        return a+b+c/3;
    }

    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        } else{
            return false;
        }
    }
    public static void isPalindrome(int n){
        int r,rev=0;
        int t = n;
        while(n>0){
            r = n%10;
            rev = (rev*10) + r;
            n =n/10;
        }
        if(rev == t){
            System.out.println(t +" is Palindrome number");
        }
        else{
            System.out.println(t + " is not Palindrome number");
        }
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Enter three number : ");
        //System.out.print("Enter a number to check Palindrome or not! : ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println("Avg of "+a+" "+b+" " +c+" " + "equal to : " +avg(a,b,c));
        // int n = sc.nextInt();
        // //System.out.println(isEven(n));
        // isPalindrome(n);
        int a = 10;
        int b = 20;
        System.out.println(Math.max(a,b));
    }
}
