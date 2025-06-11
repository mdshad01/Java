import java.util.*;
public class Arrays2 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int number[] = new int[size];

    for(int i=0; i<size; i++) {
        number[i] = sc.nextInt();
    }
    boolean isAssending = true;

    for(int i=0; i<number.length-1; i++) {
        if(number[i] > number[i+1]) {
            isAssending = false;
        }
    }
    if(isAssending) {
        System.out.println("The array is sorting in assending order");
    } else {
        System.out.println("The array is not sorting in assending order");
    }
    sc.close();
    }
}

