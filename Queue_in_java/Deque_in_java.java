package Queue_in_java;

import java.util.*;

public class Deque_in_java {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(3);
        dq.addFirst(2);
        dq.addFirst(1);
        dq.addLast(4);
        dq.addLast(5);
        dq.addLast(6);
        System.out.println(dq);
    }
}
