import java.util.Scanner;

public class c1{
    public static void BinToDec(int n){
        int myNum = n;
        int pow = 0;
        int decimalNo = 0;

        while(n>0){
            int rem = n%10;
                decimalNo = decimalNo +(rem*(int) Math.pow(2,pow));
                pow++;
                n = n/10;
        }
        System.out.println("Binary of "+myNum+" is equal to "+decimalNo+" in Decimal");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary no :  ");
        int n = sc.nextInt();
        BinToDec(n);
        sc.close();
    }
}