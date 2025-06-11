package BackTracking;

public class Hw {
    public static int ratInMaze(int x, int y, int n, int m) {
        // Base case
        if (x == n || y == m || x == -1 || y == -1) {
            return 0;
        } else if (x == n - 1 && y == m - 1) {
            return 1;
        }
        int up = ratInMaze(x, y - 1, n, m);
        int down = ratInMaze(x, y + 1, n, m);
        int right = ratInMaze(x + 1, y, n, m);
        int left = ratInMaze(x - 1, y, n, m);

        return up + down + right + left;
    }

    public static void main(String[] args) {
        int n = 4, m = 4;
        System.out.println(ratInMaze(0, 0, n, m));
    }
}
