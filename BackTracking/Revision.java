package BackTracking;

public class Revision {
    public static void array(int arr[], int i, int val) {
        if (i == arr.length) {
            printArray(arr);
            return;
        }
        arr[i] = val;
        array(arr, i + 1, val + 5);
        arr[i] = arr[i] + 5;
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void subArray(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        char ch = str.charAt(i);
        subArray(str, ans + ch, i + 1);
        subArray(str, ans, i + 1);
    }

    public static void findPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans + str.charAt(i));
        }
    }

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // left diagonal up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }

        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'x';
            }

        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------Chess Board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafeSudoku(int sudoku[][], int row, int col, int digit) {
        // row wise
        for (int j = 0; j < sudoku.length; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        // column wise
        for (int i = 0; i < sudoku.length; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }
        // grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solveSudoku(int sudoku[][], int row, int col) {
        // Base Case
        if (row == 9) {
            return true;
        }
        int nextCol = col + 1;
        int nextRow = row;
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }
        if (sudoku[row][col] != 0) {
            return solveSudoku(sudoku, nextRow, nextCol);
        }
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafeSudoku(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (solveSudoku(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }

        }
        return false;
    }

    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int gridWays(int i, int j, int n, int m) {
        // Base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        int w1 = gridWays(i + 1, j, n, m);// move down
        int w2 = gridWays(i, j + 1, n, m); // move right
        return w1 + w2;
    }

    public static void main(String[] args) {
        // int n = 4;
        // char board[][] = new char[n][n];

        // for (int i = 0; i < board.length; i++) {
        // for (int j = 0; j < board.length; j++) {
        // board[i][j] = 'x';
        // }
        // }
        // nQueens(board, 0);
        // int sudoku[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
        // { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
        // { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
        // { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
        // { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
        // { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
        // { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
        // { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
        // { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
        // if (solveSudoku(sudoku, 0, 0)) {
        // System.out.println("Solution exist");
        // printSudoku(sudoku);
        // } else {
        // System.out.println("Solution does not exist");
        // }
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
