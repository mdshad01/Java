package ArrayList;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(4);
        list.add(7);

        // Sort in accending order
        Collections.sort(list);
        System.out.println(list);

        // Sort in Decending order

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
