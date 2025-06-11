package Recursion;

public class BinaryStrings {
    public static void printBinString(int n, int lp, String str ){
        if(n == 0){
            System.out.println(str);
            return;
        }
        //work
        printBinString(n-1,0,str+0);
        if(lp == 0){
            printBinString(n-1,1,str+1);
        }
    }
    public static void main(String[] args) {
        printBinString(3,0,"");
    }
}
