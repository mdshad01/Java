interface X {
    void show();
}

interface Y {
    void display();
}

class Z implements X, Y {
    public void show() {
        System.out.println("From X");
    }

    public void display() {
        System.out.println("From Y");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Z obj = new Z();
        obj.show();
        obj.display();
    }
}
