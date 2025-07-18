package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Classroom {
    static public class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 4));// O(log n)
        pq.add(new Student("B", 5));// O(log n)
        pq.add(new Student("C", 2));// O(log n)
        pq.add(new Student("D", 12));// O(log n)
        pq.add(new Student("S", 1));// O(log n)
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); // O(1)
            pq.remove(); // O(log n)
        }
    }
}
