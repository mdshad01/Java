class A {
    String name;
}

class B extends A {
    double salary;
}

class C extends B {
    String dept;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("Department : " + dept);
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        C c1 = new C();
        c1.name = "Ajay";
        c1.salary = 35000;
        c1.dept = "IT";
        c1.display();
    }
}
