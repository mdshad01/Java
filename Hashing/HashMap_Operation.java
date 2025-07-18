package Hashing;

// import java.util.*;
import java.util.HashMap;

public class HashMap_Operation {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert - T.C = O(1)
        map.put("India", 143);
        map.put("China", 139);
        map.put("US", 38);

        System.out.println(map);

        // Get - O(1)
        int pop = map.get("India");
        System.out.println(pop);
        System.out.println(map.get("Indonesia"));

        // ContainsKey - O(1)
        System.out.println(map.containsKey("US")); // true
        System.out.println(map.containsKey("Bhutan")); // false

        // Remove - O(1)
        System.out.println(map.remove("Indonesia"));
        System.out.println(map);

        // Size - O(1)
        System.out.println(map.size());

        // isEmpty - O(1)
        System.out.println(map.isEmpty());

        // Clear -O(1)
        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map);
    }
}
