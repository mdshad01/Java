import java.util.Scanner;

public class revision {
    public static void pair(int arr[]){
        int n = arr.length-1;
        int count = 0;
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ")\t");
                count++;
            }
            System.out.println();
        }
        System.out.println(count);
    }
    public static void febonachi(int n){
        int a = 0; int b = 1;
        int c = 0;
        while(n>0){
            System.out.print(c + "  ");
            a = b;
            b = c;
            c = a+b;
            n--;

        }
    }
    public static void subarrays(int arr[]){
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total number of sub arrays is equat to : " + count);
    }
    public static void subarraysum(int arr[]){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum >= max){
                    max = sum;
                }
                if(sum <= min){
                    min = sum;
                }
                System.out.println(sum);
            }
            System.out.println();
        }
        System.out.println("Maximun sum of sub array : " + max);
        System.out.println("Minimun sum of sub arrar : " + min);
    }
    public static void prefixSum(int arr[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                sum = i == 0 ? prefix[j] : prefix[j]- prefix[i-1];
                if(sum >= max){
                    max = sum;
                }
            }
        }
        System.out.println("Maximum sum of sub array is : " + max);
    }
    public static void kadanes(int arr[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i=0;i<arr.length;i++){
            cs = cs + arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs ,ms);
        }
        System.out.println("Our Maximun sub arrays is : " + ms);
    }
    public static int trapwater(int arr[]){
        int n = arr.length;
        //calculate Maximun left boundery
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(arr[i],leftMax[i-1]); 
        }
        //calculate rigth max boundery
        int RightMax[] = new int [n];
        RightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i] = Math.max(arr[i],RightMax[i+1]);
        }
        //cltculate trap water
        int tw = 0;
        for(int i=0;i<n;i++){
            int wl = Math.min(leftMax[i], RightMax[i]);
            tw += wl-arr[i];
        }
        return tw;
    }
    public static int Calprofit(int arr[]){
        int n = arr.length;
        int buyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i=0;i<n;i++){
            if( buyPrice < arr[i]){
                int profit = arr[i] - buyPrice; // todays profit

                MaxProfit = Math.max(profit, MaxProfit); // max profit
            } else{
                buyPrice = arr[i];
            }
        }
        return MaxProfit;
    }
    static int BuyAndSellStock(int arr[]){
        int BuyPrice = Integer.MAX_VALUE;
        int MaxProfit = 0;
        for(int i=0;i<arr.length;i++){
            if(BuyPrice < arr[i]){
                int Profit = arr[i] - BuyPrice; // Today profit
                MaxProfit = Math.max(Profit, MaxProfit);
            }
            else{
                BuyPrice = arr[i];
            }
        }
        return MaxProfit;
    }
    public static void BubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
    }
    public static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minPos = i;
            for(int j=i+1;j<n;j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
                int temp = arr[minPos];
                arr[minPos] = arr[i];
                arr[i] = temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = i;
            int prev = i-1;
            while(prev>=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
    } 
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest , arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j =  0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                arr[j] = i;
                count[i]--;
                j++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ "  ");
        }
    }
    public static void diagonalSum(int b[][]){
        int sum = 0;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                if(i == j || i+j == b.length-1){
                    sum+= b[i][j];
                }
            }
        }
        System.out.println(sum);
    }
    public static void findKey(int a[][] ,int key){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(a[i][j] == key){
                    System.out.println(a[i][j] + " at index " + "(" + i + "," + j + ")");
                }
            }
        }
    }
    public static void printSprial(int b[][]){
        int startRow = 0;
        int endRow = b.length-1;
        int startCol = 0;
        int endCol = b[0].length-1;
        while( startRow <= endRow && startCol <= endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(b[startRow][j] + "  ");
            }
            //rigth
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(b[i][endCol] + "  ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(b[endRow][j] + "  ");
            }
            //left
            for(int i=endRow-1 ;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(b[i][startCol] + "  ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static int caldigoSum(int b[][]){
        int sum = 0;
        for(int i=0;i<b.length;i++){
            sum += b[i][i];
            if(i != b.length-1-i){
                sum += b[i][b.length-1-i];
            }
        }
        return sum;
    }
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0;
        int col = matrix[0].length-1;
        while(row <= matrix.length-1 && col >= 0){
            if( key == matrix[row][col]){
                System.out.println("found at " + "(" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static boolean stairSearch(int matrix[][], int key){
        int row = matrix.length-1;
        int col = 0;
        while(row >= 0 && col < matrix[0].length-1){
            if(key == matrix[row][col]){
                System.out.println("found at " + "(" + row + "," + col + ")");
                return true;
            }
            else if(key < matrix[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static int count(int array[][], int key){
        int n = array.length;
        int m = array[0].length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(array[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }
    public static int rowSum(int nums[][]){
        int sum = 0;
        for(int i=1;i<=1;i++){
            for(int j=0;j<nums[0].length;j++){
                sum += nums[i][j];
            }
        }
        return sum;
    }
    // String
    public static float distance(String path){
        int x = 0;
        int y = 0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'N' ){
                y++;
            }
            else if(dir == 'S' ){
                y--;
            }
            else if(dir == 'E' ){
                x++;
            }
            else if(dir == 'W'){
                x--;
            }
        }
        System.out.println("index " + "(" + x + "," + y + ")");
        int X2 = x*x;
        int Y2 = y*y;
        return (float) Math.sqrt(X2+Y2);
    }
    public static boolean checkPalindrome(String name){
        for(int i=0;i<name.length()/2;i++){
            char ch = name.charAt(i);
            char nm1 = name.charAt(name.length()-1-i);
            if( ch != nm1){
                return false;
            }
        }
        return true;
    }
    public static String subString(String s1, int Si, int Ei){
        String subStr = "";
        for(int i=Si;i<Ei;i++){
            subStr += s1.charAt(i);
        }
        return subStr;
    }
    public static String strbuld(String str){
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch+ "  ");
        }
        return sb.toString();
    }
    public static String toupperString(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        // for(int i=0;i<str.length()-1;i++){
        //     if(str.charAt(i) == " "){
        //         sb.append(Character.toUpperCase(str.charAt(i+1)));
        //     }
        //     else{
        //         sb.append(str.charAt(i+1));
        //     }
        // }
        return sb.toString();
    }
    // Time complexity O(n)
    public static String CompressString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while(i < str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }
    //Bit Manipulation
    public static void checkEvenOrOdd(int n){
        if((n&1) == 0){
            System.out.println(n + " is even");
        }
        else{
            System.out.println(n + " is Odd");
        }
    }
    public static int getIthBit(int n,int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 1;
        } 
        else{
            return 0;
        }
    }
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
    public static int updateIthBit(int n, int i, int newBit){
        // if(newBit == 0){
        //     return clearIthBit(n,i);
        // }
        // else{
        //     return setIthBit(n,i);
        // }
        n = clearIthBit(n,i);
        int BitMask = newBit<<i;
        return n | BitMask;

    }
    public static int clearLastIthBit(int n, int i){
        int BitMask = (~0)<<i;
        return n & BitMask;
    }
    // System.out.println(clearRangeOfBits(31,0,3)); //11111 -> 11000
    public static int clearRangeOfBits(int n,int i,int j){
        int a = (~0)<<j;
        int b = (1<<i)-1;
        int BitMask = a|b;
        return n & BitMask;
    }
    // System.out.println("====================");
        // for(int i=0;i<3;i++){
        // String s1 = sc.next();
        // int x = sc.nextInt();
        // System.out.printf("%-15s%03d%n",s1,x);
        // }
        // System.out.println("====================");
    /* 
    2^1 = 10
    2^2 = 100         
    2^3 = 1000         8-> 1000
                       7-> 0111  &
                       0-> 0000
    2^4 = 10000
    2^5 = 10000 
    */ 
    public static boolean checkPowerOf2orNot(int n){
        return (n & n-1) == 0;
    }
    //O(log n)
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count++;
            }
            n = n>>1;
        }
    return count;
    }
    public static void Swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("(" + a + ", " + b + ")");
    }
    public static int addOne(int n){
        // int m = 1;
        //  while((n&m) != 0){
        //     n = n^m;
        //     m <<= 1;
        //  }
        //  return n^m;
        return -(~n);
    }
    public static int Square(int n){
        return n^n;
    }
    public static void ToLower(){
        for(char i='A';i<='Z';i++){
            System.out.print((char)(i | ' ') + " ");
        }
    }
    // Recursion
    public static void printDec(int n){
        if(n == 1){
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n == 1){
            System.out.print(n + " ");
            return ;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static int Sum(int n){
        if(n == 1){
            return 1;
        }
        int sum = n + Sum(n-1);
        return sum;
    }
    public static int febo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int fn = febo(n-1)+febo(n-2);
        return fn;
    } // TC -> O(n) SC -> O(n)
    public static boolean checkArraySorted(int a[], int i){
        if(a[i] == a.length-1){
            return true;
        }
        if(a[i] > a[i+1]){
            return false;
        }
        return checkArraySorted(a,i+1);
    }
    public static int firstOcc(int arr[],int i, int key){
        if(i == arr.length-1){ // error use i ! arr[i]
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcc(arr,i+1,key);
    }
    public static int lastOcc(int arr[],int i, int key){
        if(i == 0){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOcc(arr,i-1,key);
    }
    public static int gratest(int a, int b, int c, int d){
        return Math.max(Math.max(a,b),Math.max(c,d));
    }
    public static int pow(int x, int n){
        if(n == 0){
            return 1;
        }
        return x * pow(x,n-1);
    }
    public static int optmizePow(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPow = optmizePow(x, n/2);
        int halfPowSq = halfPow * halfPow;
        // n is Odd
        if(n%2 != 0){
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
    public static int feb(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return feb(n-1) + feb(n-2);
    }
    public static int tilingProblem(int n){
        // Base case
        if(n == 0 || n == 1){
            return 1;
        }
        // //Verticla case
        // int fnm1 = tilingProblem(n-1);
        // // Horizental Case
        // int fnm2 = tilingProblem(n-2);
        // // total ways
        // int totalWays = fnm1 + fnm2;
        // return totalWays;
        return tilingProblem(n-1) + tilingProblem(n-2);
    }
    public static void removeDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        char currCh = str.charAt(idx);
        if(map[currCh - 'a'] == true){
            removeDuplicate(str,idx+1,newStr,map);
        }
        else{
            map[currCh - 'a'] = true;
            removeDuplicate(str,idx+1,newStr.append(currCh),map);
        }
        // removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
    // -> abhi skip karo bad me dehke ge
    public static int frindsPair(int n){
        if(n == 1 || n == 2){   // when n = 2 why we return 2 because 2C2 = 1
            return n;
        }
        return frindsPair(n-1) + (n-1) * frindsPair(n-2);
    }
    static int count = 0;
    public static void countOccurence(int arr[], int i, int key){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        countOccurence(arr,i+1,key);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {8, 2, 3, 6, 2, 9, 5, 10, 2, 5, 3, 2};
        countOccurence(arr, 0,2);
        sc.close();
    }
}
