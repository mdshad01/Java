public class HB {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                if(j == 1 || j == 10 || i == j || i+j==11) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
        } System.out.println();
    }
}
}
