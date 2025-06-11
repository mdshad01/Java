package ArrayList;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add Element
        for (int i = 1; i <= 10; i++) {
            list.add(i); // -> T.C = O(1)
        }
        list.add(1, 10);
        System.out.println(list); // -> T.C = O(n)

        // get Element

        System.out.println(list.get(0)); // -> T.C = O(1)

        // Remove Element

        list.remove(2); // -> T.C = O(n)
        System.out.println(list);

        // Set Element

        list.set(2, 10); // -> T.C = O(n)
        System.out.println(list);

        // Contain Element
        // -> T.C = O(n)
        System.out.println(list.contains(10));
        System.out.println(list.contains(22));

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println();
        for (int i = 1; i <= 5; i++) {
            list2.add(i);
        }
        for (int i = list2.size() - 1; i >= 0; i--) {
            System.out.print(list2.get(i) + " ");
        }
    }
}
