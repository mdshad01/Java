package Binary_Search_Tree;

public class Homework {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node buildTree(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }
        if (root.data > val) {
            root.left = buildTree(root.left, val);
        } else {
            root.right = buildTree(root.right, val);
        }
        return root;
    }

    public static int findSum(Node root, int l, int r) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.data >= l && root.data <= r) {
            sum += root.data;
        }
        if (root.data > l) {
            sum += findSum(root.left, l, r);
        }
        if (root.data < r) {
            sum += findSum(root.right, l, r);
        }
        return sum;
    }

    public static int sumInRange(Node root, int L, int R) {
        return findSum(root, L, R);
    }

    static int count = 0;
    static int result = -1;

    public static void inorder(Node root, int k) {
        if (root == null) {
            return;
        }
        inorder(root.left, k);
        count++;
        if (count == k) {
            result = root.data;
            return;
        }
        inorder(root.right, k);
    }

    public static int findKthsmallest(Node root, int k) {
        inorder(root, k);
        return result;
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 11, 3, 6, 20 };
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = buildTree(root, values[i]);
        }
        int k = 5;
        System.out.println("K-th smallest value for k = " + k + " is: " + findKthsmallest(root, k));
    }
}
