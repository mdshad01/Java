import java.util.*;
public class print_2D_array {
    public static boolean search(int matrix[][] , int key) {
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                System.out.println("key is found at index "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void findMax(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                largest = Math.max(matrix[i][j] , largest);
            }
        }
        System.out.print(largest);
    }
    public static void findMin(int matrix[][]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix.length; j++) {
                smallest = Math.min(matrix[i][j] , smallest);
            }
        }
        System.out.println(smallest);
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int m = matrix.length, n = matrix[0].length;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

         for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        findMin(matrix);
        sc.close();
    }
}