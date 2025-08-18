class U {
    String name;
}

class V extends U {
    void display() {
        System.out.println("Name : " + name);
    }
}

class W extends U {
    public W() {
        name = "Kja";
    }

    void display() {
        System.out.println("Name : " + name);
    }
}

public class Hierarchial {

    public static void main(String[] args) {
        V v = new V();
        v.name = "Vikash";
        v.display();
        W w = new W();
        // w.name = "Aman";
        w.display();
    }
}
