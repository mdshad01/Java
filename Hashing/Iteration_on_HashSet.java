package Hashing;

import java.util.*;

public class Iteration_on_HashSet {
    public static void main(String args[]) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Kolkata");
        cities.add("Hydrabad");
        cities.add("Noida");

        // System.out.println(cities);
        // 1. Using Iterators
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        // 2. Using Enhance for loop
        for (String city : cities) {
            System.out.println(city);
        }

    }
}
