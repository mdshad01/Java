package pattern_Printing;

public class pyramid1to10 {
    public static void main(String[] args) {
        int count = 1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
