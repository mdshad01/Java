package Stack;

import java.util.*;

public class Homework {
    public class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add(char data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public boolean isPalindrome() {
        Node temp = head;
        boolean isPalin = true;
        Stack<Character> s = new Stack<>();

        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        while (head != null) {
            char i = s.pop();
            if (head.data == i) {
                isPalin = true;
            } else {
                isPalin = false;
                break;
            }
            head = head.next;
        }
        return isPalin;
    }

    public static void main(String[] args) {
        Homework hw = new Homework();
        hw.add('A');
        hw.add('B');
        hw.add('C');
        hw.add('B');
        hw.add('A');
        System.out.println(hw.isPalindrome());
    }
}
