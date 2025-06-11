package DP;

import java.util.*;

public class CoinChange {
    public static int coinChange(int coin[], int sum) {
        int n = coin.length;
        int dp[][] = new int[n + 1][sum + 1];
        // Initialising first column of all rows
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (coin[i - 1] <= j) {
                    dp[i][j] = dp[i][j - coin[i - 1]] + dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        printDP(dp);
        return dp[n][sum];
    }

    public static void printDP(int dp[][]) {
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int rodCutting(int length[], int price[], int rodLength) {
        int n = length.length;
        int dp[][] = new int[n + 1][rodLength + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (length[i - 1] <= j) {
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        printDP(dp);
        return dp[n][rodLength];
    }

    // Using recursion
    // Longest Common Subsequence
    public static int LCS(String str1, String str2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        // same
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return LCS(str1, str2, n - 1, m - 1) + 1;
        } else {
            int ans1 = LCS(str1, str2, n - 1, m);
            int ans2 = LCS(str1, str2, n, m - 1);
            return Math.max(ans1, ans2);
        }
    }

    // Using memoization
    // Longest Common Subsequence
    public static int memoLCS(String str1, String str2, int n, int m, int dp[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            dp[n][m] = memoLCS(str1, str2, n - 1, m - 1, dp) + 1;
            return dp[n][m];
        } else {
            dp[n][m] = Math.max(memoLCS(str1, str2, n - 1, m, dp), memoLCS(str1, str2, n, m - 1, dp));
            return dp[n][m];
        }
    }

    // T.C = O(n * m)
    // Using Tabulation
    // Longest Common Subsequence
    public static int tabLCS(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        printDP(dp);
        return dp[n][m];
    }

    // Longest Common Substring
    // T.C = O(n * m);
    public static int lcs(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int max = 0;
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    max = Math.max(max, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }
        printDP(dp);
        return max;
    }

    // longest incerasing subsequence
    public static int lcs1(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (arr1[i - 1] == arr2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }

    public static int lis(int arr1[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        int arr2[] = new int[set.size()];
        int i = 0;
        for (int num : set) {
            arr2[i] = num;
            i++;
        }
        Arrays.sort(arr2);
        return lcs1(arr1, arr2);
    }

    // T.C = O(n * m)
    public static int editDist(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];
        // Initialising Row
        for (int i = 0; i < n + 1; i++) {
            dp[0][i] = i;
        }

        // Inetialising Column
        for (int i = 0; i < m + 1; i++) {
            dp[i][0] = i;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // int add = dp[i][j - 1];
                    // int del = dp[i - 1][j];
                    // int rep = dp[i - 1][j - 1];
                    // dp[i][j] = Math.min(add, Math.min(del, rep));
                    dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j], dp[i - 1][j - 1])) + 1;
                }
            }
        }
        return dp[n][m];
    }

    // longest common subsequence
    public static int lcs2(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[n][m];
    }

    public static void stringConversion(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int lcs = lcs2(str1, str2);
        System.out.println("Number of Delection : " + (n - lcs));
        System.out.println("Number of Insertion : " + (m - lcs));
    }

    public static boolean wildCardMatching(String s, String p) {
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n + 1][m + 1];

        dp[0][0] = true;
        // Initialising 0th column
        for (int i = 1; i < dp.length; i++) {
            dp[i][0] = false;
        }
        // Initialising 0th row
        for (int j = 1; j < dp[0].length; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else {
                    dp[i][j] = false;
                }
            }
        }
        return dp[n][m];
    }

    public static int catalanRev(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;
        for (int i = 0; i <= n - 1; i++) {
            ans += catalanRev(i) * catalanRev(n - i - 1);
        }
        return ans;
    }

    public static int catalanMemo(int dp[], int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int ans = 0;

        if (dp[n] != -1) {
            return dp[n];
        } else {
            for (int i = 0; i <= n - 1; i++) {
                ans += catalanMemo(dp, i) * catalanMemo(dp, n - i - 1);
            }
            dp[n] = ans;
            return dp[n];
        }
    }

    // Catalan Tabulation
    public static int catalanTab(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= i - 1; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        print(dp);
        return dp[n];
    }

    public static void print(int dp[]) {
        for (int i = 0; i < dp.length; i++) {
            System.out.print(dp[i] + " ");
        }
        System.out.println();
    }

    public static int countBST(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                int left = dp[j];
                int right = dp[i - j - 1];
                dp[i] += left * right;
            }
        }
        return dp[n];
    }

    public static int mountainRanges(int n) {
        int dp[] = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                int inside = dp[j];
                int outside = dp[i - j - 1];
                dp[i] += inside * outside;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        // int coin[] = { 2, 5, 3, 6 };
        // int coin[] = { 1, 2, 3 };
        // int sum = 4;
        // int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        // int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
        // int rodLength = 8;
        // int arr1[] = { 50, 3, 10, 7, 40, 80 };
        // String str1 = "ABCDE";
        // String str2 = "ABGCE";
        // String str1 = "intention", str2 = "execution";
        // String str1 = "abcdef", str2 = "aceg";
        // String s = "aa";
        // String p = "*";
        // int n = 4;
        // int dp[] = new int[n + 1];
        // Arrays.fill(dp, -1);
        // int dp[][] = new int[str1.length() + 1][str2.length() + 1];
        // for (int i = 0; i < dp.length; i++) {
        // for (int j = 0; j < dp[0].length; j++) {
        // dp[i][j] = -1;
        // }
        // }

        // System.out.println(coinChange(coin, sum));
        // System.out.println(rodCutting(length, price, rodLength));
        // System.out.println(LCS(str1, str2, str1.length(), str2.length()));
        // System.out.println(memoLCS(str1, str2, str1.length(), str2.length(), dp));
        // System.out.println(tabLCS(str1, str2));
        // System.out.println(lcs(str1, str2));
        // System.out.println(lis(arr1));
        // System.out.println(editDist(str1, str2));
        // stringConversion(str1, str2);
        // System.out.println(wildCardMatching(s, p));
        // System.out.println(catalanRev(10));

        // System.out.println(catalanMemo(dp, n));
        // System.out.println(catalanTab(n));
        // System.out.println(countBST(n));
        // System.out.println(mountainRanges(n));

    }
}
