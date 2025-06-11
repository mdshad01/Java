package BackTracking;

// T.C = O(2^(n+m))
public class GridWays {
    public static int gridWays(int i, int j, int n, int m) {
        // Base Case
        if (i == n - 1 && j == m - 1) { // code for last condition
            return 1;
        } else if (i == n || j == m) { // boundery condition
            return 0;
        }

        int w1 = gridWays(i + 1, j, n, m);
        int w2 = gridWays(i, j + 1, n, m);
        return w1 + w2;
    }

    public static int fact(int n) {
        // Base case
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int gridWays2(int n, int m) {
        int way = fact(n - 1 + m - 1) / (fact(n - 1) * fact(m - 1));
        return way;
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        System.out.println(gridWays(0, 0, n, m));
        System.out.println(gridWays2(n, m));
    }
}
