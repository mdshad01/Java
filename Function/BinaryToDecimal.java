package Function;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void BinToDec(int binary){
        int ld, decimal=0,i=0,myNumber=binary;
        while(binary>0){
            ld = binary%10;
            decimal+=ld*Math.pow(2,i);
            binary = binary/10;
            i++;
        }
        System.out.println("decimal of "+ myNumber+ " = " + decimal);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary number : ");
        int binary = sc.nextInt();
        BinToDec(binary);
        sc.close();
    }
}
