public class Student {
    String name;
    int roll;
    static String college = "NSU";

    static void display(Student s1) {
        System.out.println("Name : " + s1.name);
        System.out.println("roll : " + s1.roll);
        System.out.println("College : " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ajay";
        s1.roll = 38;
        display(s1);
    }
}
