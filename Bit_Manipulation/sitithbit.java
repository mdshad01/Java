package Bit_Manipulation;

public class sitithbit {
    public static int sitIthbit(int n, int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(sitIthbit(10,2));
    }
}
