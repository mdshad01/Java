import java.util.HashMap;
import java.util.Set;
public class MapRev {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
            map.put("India",150);
            map.put("Malaysia",20);

            System.out.println(map);

            // System.out.println(map.containsKey("US"));

            map.put("US",36);

            // System.out.println(map);

            // System.out.println(map.remove("US"));

            // System.out.println(map);
            // System.out.println(map.size());
            // map.clear();
            // System.out.println(map);

            // Iterate on hasj map
            Set<String> keys = map.keySet();
            System.err.println(keys);
            // System.out.println(map.keySet());
            for (String k : keys) {
                System.out.println("Key = " + k + " , " + "Value = " + map.get(k));
            }
    }
}
