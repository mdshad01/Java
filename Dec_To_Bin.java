import java.util.Scanner;

public class Dec_To_Bin {
    public static void DecToBin(long n) {
        long myNum = n;
        long pow = 0;
        long BinNum = 0;
        while(n > 0) {
            long rem = n % 2;
            BinNum = BinNum + (rem * (long) Math.pow(10,pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Binary form of " + myNum + " = " + BinNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal number : ");
        long n = sc.nextLong();
        DecToBin(n);
        sc.close();
    }
}
