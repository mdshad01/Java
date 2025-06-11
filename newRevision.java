import java.util.Scanner;

public class newRevision {
    public static void oddNumber(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "   ");
            }
        }
    }

    public static void sum(int a, int b) {
        System.out.println(a + b);
    }

    public static void div(int a, int b) {
        System.out.println(a / b);
    }

    public static void circle(int r) {
        float area, peri;
        area = (float) (3.14 * r * r);
        peri = (float) (2 * 3.14 * r);
        System.out.println(area);
        System.out.println(peri);
    }

    public static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }
    }

    public static void calculater(int n, int x, int y) {
        switch (n) {
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x * y);
                break;
            case 4:
                System.out.println((float) x / y);
                break;
            case 5:
                System.out.println(x % y);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }

    public static int linearSearch(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // int arr[] = {2, 5, 9, 23, 45, 6, 11};
    // int key = 90;
    // int index = linearSearch(arr,key);
    // if(index == -1){
    // System.out.println("Key is not Found");
    // }
    // else{
    // System.out.println("Key is at index : " + index);
    // }
    public static int findMax(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int binarySearch(int arr[], int key) {
        int si = 0;
        int ei = arr.length - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return -1;
    }

    // int index = binarySearch(arr,15);
    // if(index == -1){
    // System.out.println("Key is not Found");
    // }
    // else{
    // System.out.println("Key is at index : " + index);
    // }
    public static void reverseArray(int arr[]) {
        int n = arr.length - 1;
        for (int i = 0; i <= n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i];
            arr[n - i] = temp;
        }
    }

    public static void reverse(int arr[]) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printPairOfArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + "  ");
            }
            System.out.println();
        }
    }

    public static void subArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void maxSubArraySum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Maximun sum of sub array is : " + max);
    }

    public static void prefixSum(int arr[]) {
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        System.out.println("Maximun sub array sum is : " + max);
    }

    // TC = O(n)
    public static void kadanesAlgo(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Maximun sub array sum is : " + maxSum);
    }

    public static void trapRainWater(int height[]) {
        int trappedWater = 0;
        int n = height.length;
        // For left Max boundery
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // for right max boundery
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        // loop
        for (int i = 0; i < n; i++) {
            // calculate Water level
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        System.out.println(trappedWater);
    }

    public static void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }
    }

    public static void contingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(arr[i], largest);
        }

        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void twoDMatrix(int arr[][]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSpiralMatrix(int arr[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length - 1;
        int endCol = arr[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            // Right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endCol] + " ");
            }
            // Bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    public static void printDiagonal(int arr[][]) {
        // TC = O(n^2)
        // int sum = 0;
        // for(int i=0;i<arr.length;i++){
        // for(int j=0;j<arr[0].length;j++){
        // // principal diagonal
        // if(i == j){
        // sum += arr[i][j];
        // }
        // // Secondery diagonal
        // else if(i+j == arr.length-1){
        // sum += arr[i][j];
        // }
        // }
        // }
        // System.out.println(sum);

        // Optmize code
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
            if (i != arr.length - 1 - i) {
                sum += arr[i][arr.length - 1 - i];
            }
        }
        System.out.println(sum);
    }

    // TC = O(n^2)
    public static void staircaseSearch(int matrix[][], int key) {
        int row = matrix.length - 1, col = 0;

        while (row >= 0 && col < matrix[0].length) {

            if (key == matrix[row][col]) {
                System.out.println("Key is found at " + "(" + row + "," + col + ")");
                return;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        System.out.println("Key is not Found!");
    }

    public static void getPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'S') {
                y--;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'W') {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        System.out.println((float) Math.sqrt(X2 + Y2));
    }

    public static void printLargest(String str[]) {
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareTo(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.println(largest);
    }

    public static void toUpper(String name) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(name.charAt(0));
        sb.append(ch);
        for (int i = 1; i < name.length(); i++) {
            ch = name.charAt(i);
            if (ch == ' ') {
                sb.append(ch);
                i++;
                sb.append(Character.toUpperCase(name.charAt(i)));

            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }

    public static String compression(String str) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void countLowerCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void checkEvenOdd(int n) {
        if ((n & 1) == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }
    }

    public static int getIthBit(int n, int i) {
        int bitMask = (1 << i);
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = (1 << i);
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        // if(newBit == 0){
        // return clearIthBit(n,i);
        // }
        // else{
        // return setIthBit(n,i);
        // }
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    public static int clearLastIthBit(int n, int i) {
        int BitMask = (~0) << i;
        return n & BitMask;
    }

    public static int rangeOfBits(int n, int j, int i) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int BitMask = a | b;
        return n & BitMask;
    }

    public static boolean isPowerOfTwo(int n) {
        return ((n & (n - 1)) == 0);
    }

    public static int fastExp(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = (n >> 1);
        }
        return ans;
    }

    public static int fastExp2(int x, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * x;
            }
            x = x * x;
            n = (n >> 1);
        }
        return ans;
    }

    public static void swap(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x = " + x + " , " + " y = " + y);
    }

    public static int addOne(int n) {
        return -(~n);
    }

    public static void toUpperCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print((char) (str.charAt(i) | ' '));
        }
    }
    // class Student{
    // String name;
    // int roll;
    // int marks[];

    // Student(){
    // marks = new int[3];
    // System.out.println("Student is called");

    // }
    // Student(String name){
    // marks = new int[3];
    // this.name = name;
    // }
    // // Sallow copy
    // // Student(Student s1){
    // // marks = new int[3];
    // // this.name = s1.name;
    // // this.roll = s1.roll;
    // // this.marks = s1.marks;
    // // }
    // // Deep Copy
    // Student(Student s1){
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // for(int i=0;i<marks.length;i++){
    // this.marks[i] = s1.marks[i];
    // }
    // }
    // }
    // class Pen{
    // private String color;
    // int price;
    // //private int tip;

    // void setColor(String color){
    // this.color = color;
    // }
    // void getColor(){
    // System.out.println(this.color);
    // }
    // Pen(){
    // System.out.println("Pen is colled");
    // }
    // Pen(int price){
    // this.price = price;
    // }
    // }
    // interface ChessPlayer{
    // void moves();
    // }

    // class Queen implements ChessPlayer{
    // public void moves(){
    // System.out.println("up, down, left, right, diagonal( in all four
    // direction)");
    // }
    // }

    // class Rock implements ChessPlayer{
    // public void moves(){
    // System.out.println("up, down, left , right");
    // }
    // }

    // class Pown implements ChessPlayer{
    // public void moves(){
    // System.out.println("(only one step in all direction)up, doen left, right,
    // diagonal(only front )");
    // }
    // }
    public static void printNTo1(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printNTo1(n - 1);
    }

    public static void print1ToN(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        print1ToN(n - 1);
        System.out.println(n);
    }

    public static void fact1(int n) {
        if (n == 1) {
            return;
        }
        int fNm1 = fact(n - 1); // fnm1 = 4 -> 3 -> 2 -> 1
        int fN = n * fNm1;
        System.out.println(fN);
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int sumNno(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNno(n - 1);
    }

    public static int febo(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return febo(n - 1) + febo(n - 2);
    }

    public static int feboSeries(int n) {
        if (n <= 1) {
            System.out.println(n + " ");
            return n;
        }
        int fNm2 = feboSeries(n - 2);
        int fNm1 = feboSeries(n - 1);
        int fN = fNm1 + fNm2;
        System.out.println(fN + " ");
        return fN;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static int firstOccurrence(int arr[], int i, int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstOccurrence(arr, i + 1, key);
    }

    // Backtracking
    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArray(arr);
            return;
        }
        // Recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 5);
        arr[i] += 5;
    }

    public static void printSubString(String str, StringBuilder sb, int i) {
        if (i == str.length()) {
            if (sb.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(sb.toString());
            }
            return;
        }
        printSubString(str, sb.append(str.charAt(i)), i + 1);
        sb.deleteCharAt(sb.length() - 1);
        printSubString(str, sb, i + 1);
    }

    public static void findPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abc" = " " + "bc"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }
}

class Temp {
    Temp() {
        System.out.println("The Default");
    }

    Temp(int x) {
        this();
        System.out.println(x);
    }

    Temp(int x, int y) {
        this(5);
        System.out.println(x * y);
    }
}
