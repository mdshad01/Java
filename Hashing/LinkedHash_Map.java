package Hashing;

import java.util.*;

public class LinkedHash_Map {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 140);
        lhm.put("China", 150);
        lhm.put("USA", 39);
        lhm.put("Indonasia", 28);

        System.out.println(lhm);
    }
}
