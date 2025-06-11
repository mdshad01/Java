// import java.util.*;

// public class Butterfly_pattern {
//     public static void main(String[] args){
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     // upper half
//     for(int i=1; i<=n; i++) {
//         for(int j=1; j<=i; j++) {
//             System.out.print("*");
//         } for(int j=1; j<=2*(n-i); j++) {
//             System.out.print(" ");
//         } for(int j=1; j<=i; j++) {
//             System.out.print("*");
//         } 
//         System.out.println();
//         }
//         // lower half
//         for(int i=n; i>=1; i--) {
//         for(int j=1; j<=i; j++) {
//             System.out.print("*");
//         } for(int j=1; j<=2*(n-i); j++) {
//             System.out.print(" ");
//         } for(int j=1; j<=i; j++) {
//             System.out.print("*");
//         } 
//         System.out.println();
//         }
//         sc.close();
//     }
// }
import java.util.*;

public class Butterfly_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=2*n; i++) {
            int j = i > n ? 2*n - i : i;
            printPattern(j, n);
        }
        sc.close();
    }

    static void printPattern(int i, int n) {
        printChar(i, "*");
        printChar(2*(n-i), " ");
        printChar(i, "*");
        System.out.println();
    }

    static void printChar(int n, String c) {
        for(int i=0; i<n; i++) {
            System.out.print(c);
        }
    }
}

