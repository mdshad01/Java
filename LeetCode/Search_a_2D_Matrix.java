package LeetCode;
public class Search_a_2D_Matrix {
    // TC = O(n^2)
    public static boolean searchMatrix(int matrix[][], int target){
        for(int i = 0; i < matrix.length; i++) {
            for( int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    // TC = O(log m*n)

    public static boolean searchInRow(int[][] matrix, int target, int row){
        int n = matrix[0].length;
        int st = 0, ed = n - 1;
        while(st <= ed) {
            int mid = st + (ed - st) / 2;
            if(target == matrix[row][mid]) return true;
            else if(target > matrix[row][mid]) st = mid + 1;
            else ed = mid - 1;
        }
        return false;
    }

    public static boolean searchMatrix2(int[][] matrix, int target){
        int m = matrix.length, n = matrix[0].length;
        int startRow = 0, endRow = m - 1;
        while(startRow <= endRow){
            int midRow = startRow + (endRow - startRow) / 2;
            if(target >= matrix[midRow][0] && target <= matrix[midRow][n-1])return searchInRow(matrix, target, midRow);
            else if (target > matrix[midRow][n-1]) startRow = midRow + 1;
            else endRow = midRow - 1;
        }
        return false;
    }


    public static void main(String[] args) {
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        // System.out.println(searchMatrix(matrix, 31));
        System.err.println(searchMatrix2(matrix, 5));
    }
}
