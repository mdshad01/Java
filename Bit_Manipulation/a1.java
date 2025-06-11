package Bit_Manipulation;

public class a1 {
    public static int clearRangeBits(int n,int i,int j){
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int BitMask = a | b;
        return n & BitMask;
    }
    public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~35);
        // System.out.println(5<<2);
        // System.out.println(6>>1);
        System.out.println(clearRangeBits(31, 2, 5));
    }
}
