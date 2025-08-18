class Employee {
    String name;
    double salary;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

class Faculty extends Employee {
    String dept;

    void display() {
        super.display();
        System.out.println("Department : " + dept);
    }
}

public class Inheritance2 {
    public static void main(String[] args) {
        Faculty f1 = new Faculty();
        f1.name = "BJ";
        f1.salary = 50000;
        f1.dept = "IT";
        f1.display();
    }
}
