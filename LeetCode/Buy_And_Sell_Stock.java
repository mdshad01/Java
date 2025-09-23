package LeetCode;

public class Buy_And_Sell_Stock {
    public static int maxProfit(int[] p) {
        int n = p.length;
        int max = 0, curr = 0, buy = Integer.MIN_VALUE, sell = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            buy = i;
            for (int j = i + 1; j < n; j++) {
                sell = j;
                curr = p[sell] - p[buy];
                max = Math.max(max, curr);
            }
        }
        return max;
    }

    public static int maxProfit2(int[] p) {
        int n = p.length, bestBuy = p[0], curr = 0, max = 0;
        for (int i = 1; i < n; i++) {
            bestBuy = Math.min(bestBuy, p[i]);
            curr = p[i] - bestBuy;
            max = Math.max(max, curr);
        }
        return max;
    }

    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };
        // System.err.println(maxProfit(price));
        System.err.println(maxProfit2(price));
    }
}
