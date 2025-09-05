package LabManual;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean isPalindrome = true;
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
