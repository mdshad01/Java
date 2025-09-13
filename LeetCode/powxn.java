package LeetCode;

public class powxn {
    public static double myPow(double x, int n) {
        double ans = 1;
        if (n < 0) {
            x = 1 / x;
            n = -n;
        }
        while (n > 0) {
            if (n % 2 == 1) {
                ans *= x;
            }
            x = x * x;
            n = n / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(3, 10));
    }
}
