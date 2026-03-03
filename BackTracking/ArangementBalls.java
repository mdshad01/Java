package BackTracking;

import java.util.Scanner;

public class ArangementBalls {
    static int countWays(int g, int y, int r, char last) {

        // Base Case: If no balls left
        if (g == 0 && y == 0 && r == 0) {
            return 1;
        }

        int count = 0;

        // Place Green
        if (g > 0 && last != 'G') {
            count += countWays(g - 1, y, r, 'G');
        }

        // Place Yellow
        if (y > 0 && last != 'Y') {
            count += countWays(g, y - 1, r, 'Y');
        }

        // Place Red
        if (r > 0 && last != 'R') {
            count += countWays(g, y, r - 1, 'R');
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int G = sc.nextInt();
        int Y = sc.nextInt();
        int R = sc.nextInt();

        int result = countWays(G, Y, R, ' ');

        System.out.println(result);

        sc.close();
    }
}
