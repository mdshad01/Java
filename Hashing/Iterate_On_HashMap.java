package Hashing;

import java.util.*;

public class Iterate_On_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 145);
        map.put("China", 142);
        map.put("USA", 38);
        map.put("Indonesia", 26);
        map.put("Bangladesh", 17);

        Set<Map.Entry<String, Integer>> keys = map.entrySet();
        System.out.println(keys);

        for (Map.Entry<String, Integer> k : keys) {
            System.out.println(k);
            // System.out.println("Country = " + k + ", Population = " + map.get(k));
        }

        Set<String> key = map.keySet();
        for (String k : key) {
            System.out.println("Country = " + k + ", Population = " + map.get(k));
        }
    }
}
