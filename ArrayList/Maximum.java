package ArrayList;

import java.util.*;

public class Maximum {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // int max = Integer.MIN_VALUE;
        // for (int i = 0; i < list.size(); i++) {
        // // if (list.get(i) >= max) {
        // // max = list.get(i);
        // // }
        // max = Math.max(max, list.get(i));
        // }
        // System.out.println("max element is : " + max);
        System.out.println(list);
        swap(list, 1, 3);
        System.out.println(list);

    }

}
