//package Opps_java;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student();
        // Student s3 = new Student(31);
        // Student s4 = new Student("Tony Stark");
        // System.out.println(s1.name);
        // System.out.println(s3.roll);
        // System.out.println(s4.name);
        s1.name = "Shad";
        s1.roll = 123;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[2] = 100;
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];
    // Copy Constructor
    // Shallow Copy Constructor
    // Student(Student s1){
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < s1.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Non - Parameterized Constructor
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called..........");
    }

    // Prameterized Constructor
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}