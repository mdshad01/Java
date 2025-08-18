interface Animal {
    void sound();

    // default void walk() {
    // System.out.println("Animal walk");
    // }
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat Meows");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        // d.walk();
    }
}
