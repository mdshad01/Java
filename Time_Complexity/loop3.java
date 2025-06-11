package Time_Complexity;

public class loop3 {
    public static void main(String[] args) {
        int n = 50, k = 5;
        for(int i=0;i<n;i=i+k){
            for(int j=i+1;j<k;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
