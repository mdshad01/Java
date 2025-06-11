import java.util.*;

public class Array1 {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for(int i=0; i<size; i++) {
            number[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<number.length; i++) {
            if( number[i] < min) {
                min = number[i];
            }
            if(number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Largest number is : " + max);
        System.out.println("smallest number is : " + min);
        sc.close();
    }
}