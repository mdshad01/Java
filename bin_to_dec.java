import java.util.*;

public class bin_to_dec {
    public static void BinToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum > 0) {
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig *(int) Math.pow(2,pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal number of " + myNum + " = " + decNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary number : ");
        int n = sc.nextInt();
        BinToDec(n);
        sc.close();

    }
}
