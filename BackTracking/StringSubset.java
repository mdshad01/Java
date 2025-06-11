package BackTracking;

//T.C = O(2^n);
public class StringSubset {
    public static void findSubset(String str, String ans, int i) {
        // Base Case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("Null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Recursion
        findSubset(str, ans + str.charAt(i), i + 1); // yes condition
        findSubset(str, ans, i + 1); // no condition
    }

    public static void main(String[] args) {
        findSubset("abc", "", 0);
    }
}
