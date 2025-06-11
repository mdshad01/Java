//package Opps_java;

public class Static {
    public static void main(String[] args) {
        // Student s = new Student();
        // Student.schoolName = "KPS";
        // Student s6 = new Student();
        // System.out.println(s6.schoolName);

        // Student s7 = new Student();
        // s7.schoolName = "NSPS";
        // System.out.println(s7.schoolName);
        Student.schoolName = "NSPS";
        System.out.println(Student.schoolName);
    }
}

class Student {
    String name;
    int roll;
    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}