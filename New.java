import java.util.*;
public class New {
    public static int CalcSum(int n, int[] arr){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
       // Check if input is integer
        if (sc.hasNextInt()) {
            int n = sc.nextInt();

            // Check range 1 to 100
            if (n >= 1 && n <= 100) {
                int arr[] = new int[n];
                for(int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                }
                System.out.println("Valid input: " + n);
                System.out.println(CalcSum(n,arr));
            } else {
                System.out.println("Error: Input out of range");
            }

        } else {
            System.out.println("Error: Invalid input (Not an integer)");
        }

        sc.close();
    }
}
