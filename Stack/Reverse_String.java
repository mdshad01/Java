package Stack;

import java.util.*;

public class Reverse_String {
    public static String reverseStr(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "moon";
        System.out.println(reverseStr(str));
    }
}
