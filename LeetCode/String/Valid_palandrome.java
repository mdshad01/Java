package LeetCode.String;

public class Valid_palandrome {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase().trim().replaceAll("[^A-Za-z0-9]","");
        int n = str.length();
        for(int i = 0; i < n/2; i++) {
            if(str.charAt(i) != str.charAt(n - i - 1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        String s = "dcba";
        // System.out.println(str.toLowerCase());
        // System.out.println(Character.isLetterOrDigit(str.charAt(2)));
        System.out.println(s.sort());
    }
}
