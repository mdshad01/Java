public class traping_water {
    public static int trappedRainwater(int height[]) {
        int n = height.length;

        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        int rigthMax[] = new int[n];
        rigthMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rigthMax[i] = Math.max(height[i], rigthMax[i+1]);
        }
        int trappedwater = 0;

        for(int i=0; i<n; i++) {
            int waterLevel = Math.min(leftMax[i], rigthMax[i]);

            trappedwater += waterLevel - height[i];
        }
        return trappedwater;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedRainwater(height));
    }
}
