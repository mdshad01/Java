package Tries;

public class Prefix_Problem {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null; // (frequency) har node ko kitni baar visit kiya gaya hai yeh batata hai.
            }
            freq = 1;
        }
    }

    public static Node root = new Node(); // always create root outside the Node class

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static String printPrefix(String word) {
        Node curr = root;
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            sb.append(word.charAt(i));
            if (curr.children[idx].freq == 1) {
                break;
            }
            curr = curr.children[idx];
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String arr[] = { "zebra", "dog", "duck", "dove" };
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
        // Print the unique prefix for each word
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ": " + printPrefix(arr[i]));
        }
    }
}
