package LabManual;

class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }

    Animal(String name) {
        this(); // calls default constructor of same class
        System.out.println("Animal constructor with name: " + name);
    }
}

class Dog extends Animal {
    Dog() {
        super("Generic Animal"); // calls parameterized constructor of Animal
        System.out.println("Dog default constructor called");
    }

    Dog(String breed) {
        this(); // calls Dog() constructor
        System.out.println("Dog constructor with breed: " + breed);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        Dog d1 = new Dog(); // calls Dog()
        System.out.println("-----");
        Dog d2 = new Dog("Bulldog"); // calls Dog(String)
    }
}
