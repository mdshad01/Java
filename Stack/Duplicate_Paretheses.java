package Stack;

import java.util.*;

// T.C = O(n)
public class Duplicate_Paretheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            // Closing
            if (ch == ')') {
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    s.pop();
                    return true; // duplicate
                }
            } else {
                // opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+c)";
        // String str2 = "((a-b))";
        System.out.println(isDuplicate(str));
    }
}
