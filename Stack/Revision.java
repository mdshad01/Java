package Stack;

import java.util.*;

public class Revision {
    // static ArrayList<Integer> list = new ArrayList<>();

    // public static boolean isEmpty() {
    // return list.size() == 0;
    // }

    // public static void push(int data) {
    // list.add(data);
    // }

    // public static int pop() {
    // if (isEmpty()) {
    // return Integer.MIN_VALUE;
    // }
    // int val = list.get(list.size() - 1);
    // list.remove(list.size() - 1);
    // return val;
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // return Integer.MIN_VALUE;
    // }
    // return list.get(list.size() - 1);
    // }
    // static class Node {
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // this.next = null;
    // }
    // }

    // public static Node head = null;

    // public static boolean isEmpty() {
    // return head == null;
    // }

    // // push
    // public static void push(int data) {
    // Node newNode = new Node(data);
    // newNode.next = head;
    // head = newNode;
    // }

    // // pop

    // public static int pop() {
    // if (isEmpty()) {
    // return -1;
    // }
    // int top = head.data;
    // head = head.next;
    // return top;
    // }

    // // peek

    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }
    // return head.data;
    // }

    // T>C = (n)
    // Push at bottom
    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }

    // Reverse a stack
    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushBottom(s, top);

    }

    // Stock span problem
    // T.C = O(n)
    public static void stockSpan(int stocks[], int span[]) {
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < stocks.length; i++) {
            int currStocks = stocks[i];
            while (!s.isEmpty() && currStocks >= stocks[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prevHigh = s.peek();
                span[i] = i - prevHigh;
            }
            s.push(i);
        }
    }

    // Next Grater Element
    public static void nextGrater(int arr[], int grater[]) {
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) { // ...
            int curr = arr[i];
            while (!s.isEmpty() && curr >= arr[s.peek()]) {
                s.pop();
            }
            if (s.isEmpty()) {
                grater[i] = -1;
            } else {
                grater[i] = arr[s.peek()]; // ...
            }
            s.push(i);
        }
    }

    // Valid parentheses
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') { // Opening
                s.push(ch);
            } else { // Closing
                if (s.isEmpty()) {
                    return false;
                }
                if (s.peek() == '(' && ch == ')'
                        || s.peek() == '[' && ch == ']'
                        || s.peek() == '{' && ch == '}') {
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }

    // Duplcate paretheses
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            if (ch == ')') {
                while (s.pop() != '(') {
                    count++;
                }
                if (count < 1) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        }
        if (s.isEmpty()) {
            return false;
        }
        return true;
    }

    // Max Area in Histogram
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        Stack<Integer> s = new Stack<>();
        // For next smaller right
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }
        // For next smaller left
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = arr.length;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // area = height * widht
        for (int i = 0; i < arr.length; i++) {
            int width = nsr[i] - nsl[i] - 1;
            int height = arr[i];
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("Maximum area in Histogram is :" + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        maxArea(arr);
    }
}
