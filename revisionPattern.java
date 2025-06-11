import java.util.Scanner;
public class revisionPattern {
    public static void hollowRect(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i == 4 || j == 5 || j == 1){
                    System.out.print("*");
                }
                if(i==2 && j!=1 || i==3 && j!=1){
                    System.out.print(" ");
                }
            }               
            System.out.println();
        }
    }
    public static void invertedHP(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void HFpyramid(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void FTpattern(int n){
        int count = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void Tonezero(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        hollowRect();
        invertedHP(n);
        HFpyramid(n);
        FTpattern(n);
        Tonezero(n);
        sc.close();
    }
}
