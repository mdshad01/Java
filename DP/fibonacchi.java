package DP;

import java.util.*;

public class fibonacchi {
    // T.C = O(n)
    public static int fibo(int n, int f[]) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (f[n] != 0) {
            return f[n];
        }
        f[n] = fibo(n - 1, f) + fibo(n - 2, f);
        return f[n];
    }

    // T.C = O(2^n)
    public static int fibo2(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo2(n - 1) + fibo2(n - 2);
    }

    public static int fib(int n) {
        int dp[] = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i < dp.length; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // T.C = O(n)
    public static int ways(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = ways(n - 1, ways) + ways(n - 2, ways);
        return ways[n];
    }

    // Doubt
    public static int ways3(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) {
            return ways[n];
        }
        ways[n] = ways3(n - 1, ways) + ways3(n - 2, ways) + ways3(n - 3, ways);
        return ways[n];
    }

    public static int tabulatingWays(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0;
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 5;
        // int f[] = new int[n + 1];
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        // System.out.println(fibo(n, f));
        // System.out.println(fibo2(n));
        // System.out.println(fib(n));
        System.out.println(ways3(n, ways));
        // System.out.println(tabulatingWays(n));
    }
}
