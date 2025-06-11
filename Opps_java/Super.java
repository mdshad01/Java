// package Opps_java;

public class Super {
    public static void main(String[] args) {
        Lion l = new Lion();
        System.out.println(l.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constroctor called");
    }
}

class Lion extends Animal {
    Lion() {
        color = "brown";
        System.out.println("Lion constructor called");
    }
}