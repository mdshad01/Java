package LeetCode;

// Q11

public class Container_With_Most_Water {
    public static int maxWater(int height[]) {
        int n = height.length;
        int l = 0, r = n - 1, max = 0, area = 0;
        for (int i = 0; i < n; i++) {
            int h = Math.min(height[l], height[r]);
            int w = r - l;
            area = w * h;
            max = Math.max(area, max);
            if (height[l] < height[r]) {

                l++;
            } else {
                r--;
            }
        }
        return max;
    }

    public static int maxWater2(int height[]) {
        int n = height.length;
        int l = 0, r = n - 1, max = 0;
        while (l < r) {
            int area, h;
            if (height[l] < height[r]) {
                h = height[l];
                area = h * (r - l);
                if (area > max) {
                    max = area;
                }
                l++;
            } else {
                h = height[r];
                area = h * (r - l);
                if (area > max) {
                    max = area;
                }
                r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        long start = System.nanoTime(); // start time
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxWater(height));
        // System.err.println(maxWater2(height));
        long end = System.nanoTime(); // end time
        System.out.println("Execution time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
