package Function;

import java.util.Scanner;

public class DecimalToBinary {
    public static void decToBin(int decimal){
        int sum=0,rem,i=0,myNumber=decimal;
        while(decimal>0){
            rem = decimal % 2;
            sum+=rem*Math.pow(10,i);
            decimal = decimal / 2;
            i++;
        }
        System.out.println("Binary of " + myNumber + " = " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int decimal = sc.nextInt();
        decToBin(decimal);
        sc.close();
    }
}
