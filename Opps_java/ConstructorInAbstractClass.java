//package Opps_java;

public class ConstructorInAbstractClass {
    public static void main(String[] args) {
        Mustang m = new Mustang();
        m.changeColor();
        System.out.println(m.color);
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
        System.out.println("Animal Constructor Called");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse Constructor Called");
    }

    void changeColor() {
        color = "Dark Brown";
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor Called");
    }

    void changeColor() {
        color = "Black";
    }
}
