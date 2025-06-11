package Bit_Manipulation;

public class clearIbit {
    public static int clearIthbits(int n,int i){
        int bitMask = ~(0) << i;
        return n & bitMask;
    }

public static int cleariTojthbit(int n,int i,int j){
    int a = ((~0) << (j+1));
    int b = (1 << i) - 1; 
    int bitmask = a | b;
    return n & bitmask;
}
    public static void main(String[] args) {
        System.out.println(cleariTojthbit(15,2,4));
    }
}
