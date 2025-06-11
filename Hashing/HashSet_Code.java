package Hashing;

import java.util.*;

public class HashSet_Code {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println(set.remove(2));
        System.out.println(set.contains(2));
        System.out.println(set);
    }
}
