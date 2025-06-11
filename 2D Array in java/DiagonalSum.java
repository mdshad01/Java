public class DiagonalSum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;
        for(int i=0; i<matrix.length; i++) {
            sum+= matrix[i][i];// for diagona element

            if(i != matrix.length-1-i) {
                sum+= matrix[i][matrix.length-i-1]; // i+j = n-1 => j = n-1-i
            }
        }
        return sum;
    }
    public static int printDiagSum(int arr[][]){
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if( i==j || i+j == arr.length-1) {
                    sum+= arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8}, 
                          {9, 10, 11, 12}, 
                          {13, 14, 15, 16}};
        // int matrix[][] = {{0, 1, 2},
        //                   {3, 4, 5},
        //                   {6, 7, 8},};
    System.out.println(diagonalSum(matrix));
    System.out.println(printDiagSum(matrix));
    }
}
