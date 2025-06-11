package hw;

public class Rev2 {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1, f = 1; i <= n; f *= i, i++) {
            System.out.print(f + " ");
        }
    }
}
