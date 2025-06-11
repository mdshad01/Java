package BackTracking;

//T.C = O(n*2^n);
//S.C = O(n)
public class StringSubsetSB {
    public static void printSubString(String str, StringBuilder sb, int i) {
        // Base Condition
        if (i == str.length()) {
            if (sb.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(sb.toString());
            }
            return;
        }
        // For Yes
        printSubString(str, sb.append(str.charAt(i)), i + 1);
        sb.deleteCharAt(sb.length() - 1);
        // For No
        printSubString(str, sb, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubString(str, new StringBuilder(""), 0);
    }
}
