package Hashing;

import java.util.HashMap;
import java.util.Set;

public class Rev {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap();

        // Insert - O(1)
        map.put("India", 1440000000);
        map.put("China", 1400000000);
        map.put("US", 350000000);

        Set<String> keys = map.keySet();
        for (String k : keys) {
            System.out.println("Keys = " + k + " , " + "Value = " + map.get(k));
        }

        // System.out.println(map);

        // // Get - O(1)

        // System.out.println(map.get("US"));
        // System.out.println(map.get("India"));

        // // ContainsKey - O(1)

        // System.out.println(map.containsKey("India"));
        // System.out.println(map.containsKey("UK"));

        // // remove - O(1)

        // System.err.println(map.remove("China"));

        // System.out.println(map);
    }
}
