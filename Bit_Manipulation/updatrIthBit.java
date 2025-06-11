package Bit_Manipulation;

public class updatrIthBit {
    public static int setithbit(int n,int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }
    public static int clearithbit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static int updateithbit(int n, int i, int newBit){
    //     if(newBit == 0){
    //         return clearithbit(n,i);
    //     }else{
    //         return setithbit(n,i);
    //     }
    
        n = clearithbit(n,i);
        int bitMask = newBit << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(updateithbit(10, 2,1));
    }
}
 