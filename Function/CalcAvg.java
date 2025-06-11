package Function;

import java.util.*;

public class CalcAvg {
    public static float avg(int n1, int n2, int n3){
        return(float)(n1+n2+n3)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println(avg(n1,n2,n3));
        sc.close();
    }
}
