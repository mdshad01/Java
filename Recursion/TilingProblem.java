package Recursion;

public class TilingProblem {
    public static int tailproblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        // for vertical choice
        int fnm1 = tailproblem(n-1);
        // for Herozintal choice
        int fnm2 = tailproblem(n-2);
        return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println(tailproblem(8));
    }
}
