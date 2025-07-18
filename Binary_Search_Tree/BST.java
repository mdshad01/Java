package Binary_Search_Tree;

import java.util.*;

public class BST {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static Node insert(Node root, int val) { // T.C = O(H) -> where H is height of three
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root) { // T.C = O(n)
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean search(Node root, int key) { // T.C = O(H) -> In worst case O(n)
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node deleteNode(Node root, int val) { // T.C = O(H)
        if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else {

            // case 1 : leaf node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 : singlt child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 : both child

            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = deleteNode(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root) { // T.C = O(H)
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }

        else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
    }

    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        }

        printRootToLeaf(root.left, path);
        printRootToLeaf(root.right, path);
        path.remove(path.size() - 1);
    }

    public static boolean isValisBST(Node root, Node min, Node max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.data <= min.data) {
            return false;

        }
        if (max != null && root.data >= max.data) {
            return false;
        }
        return isValisBST(root.left, min, root) && isValisBST(root.right, root, max);
    }

    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }
        Node leftS = mirror(root.left);
        Node rightS = mirror(root.right);

        root.left = rightS;
        root.right = leftS;
        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 6, 10, 11 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        preorder(root);
        System.out.println();

        Node root2 = mirror(root);
        preorder(root2);

    }
}
