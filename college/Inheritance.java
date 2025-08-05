package college;

class Employee {
    String name;
    double salary;
    String empName = "Ajay";

    Employee() {
        System.out.println("Employee constructor is called");
    }

    void display() {
        System.out.println("Name: " + name + " , " + "Salary: " + salary);
    }
}

class Faculty extends Employee {
    String spcl;
    String empName = "Bijay";

    Faculty() {
        super();
        System.out.println("Faculty constructor is called");
    }

    void display() {
        super.display();
        System.out.println("Specialization: " + spcl);
        // System.out.println("Faculty Name : " + empName);
        // System.out.println("Enmloyee Name : " + super.empName);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // String str = null;
        // System.out.println(str.length());
        Employee emp = new Employee();
        emp.name = "Biswajit";
        emp.salary = 5000000;
        emp.display();
        Faculty f = new Faculty();
        f.name = "Ajay";
        f.salary = 36000;
        f.spcl = "Java";
        f.display();
    }
}
