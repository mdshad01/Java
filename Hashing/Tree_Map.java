package Hashing;

import java.util.*;

public class Tree_Map {
    public static void main(String[] args) {
        TreeMap<String, Integer> tp = new TreeMap<>();
        tp.put("India", 140); // O(log n)
        tp.put("Indonesia", 28); // O(log n)
        tp.put("USA", 38); // O(log n)
        tp.put("Chiana", 150); // O(log n)

        System.out.println(tp);
    }
}
