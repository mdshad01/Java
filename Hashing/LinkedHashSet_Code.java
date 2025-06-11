package Hashing;

import java.util.*;

public class LinkedHashSet_Code {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Hydrabad");
        cities.add("Noida");

        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Kolkata");
        lhs.add("Hydrabad");
        lhs.add("Noida");

        System.out.println(lhs);
    }
}
