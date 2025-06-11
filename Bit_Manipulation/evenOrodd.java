package Bit_Manipulation;
public class evenOrodd{
    public static void printevenOrodd(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even number");
        }else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        printevenOrodd(5);
        printevenOrodd(4);
        printevenOrodd(3);
    }
}