public class Student {
    String name;
    int roll;
    static String college = "NSU";

    static void display(Student s) {
        System.out.println("Name : " + s.name);
        System.out.println("Roll : " + s.roll);
        System.out.println("College : " + college);
    }

    static {
        System.out.println("Static block is executed.");
    }

    public static void main(String[] args) {
        System.out.println("Main method is executed.");
        Student s1 = new Student();
        s1.name = "Ajay";
        s1.roll = 52;
        Student.display(s1);
    }
}
