package Tries;

// import java.util.*;

public class Revision {
    static class Node {
        Node child[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                child[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
            } else {
                curr.child[idx].freq++;
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public static String prefix(String word) {
        Node curr = root;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            sb.append(word.charAt(i)); //
            if (curr.child[idx].freq == 1) {
                break;
            }
            curr = curr.child[idx];
        }
        return sb.toString();
    }

    public static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordBreak(String key) { // T.C = O(L) where L is length of key
        if (key.length() == 0) {
            return true;
        }
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public static boolean startWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.child[idx] == null) {
                return false;
            }
            curr = curr.child[idx];
        }
        return true;
    }

    public static int countNode(Node root) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.child[i] != null) {
                count += countNode(root.child[i]);
            }
        }
        return count + 1;
    }

    public static String ans = "";

    public static void longestWord(Node root, StringBuilder sb) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.child[i] != null && root.child[i].eow == true) {
                char ch = (char) (i + 'a');
                sb.append(ch);
                if (sb.length() > ans.length()) {
                    ans = sb.toString();
                }
                longestWord(root.child[i], sb);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };
        // String str = "apple";
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
