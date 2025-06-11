//package Opps_java;

public class HomeWork {
    public static void main(String[] args) {
        // Vehicle v = new Car();
        // v.print();
        // Vehicle v2 = new Vehicle();
        // v2.print();
        System.out.println(Book.count);
        Book b1 = new Book(150);
        Book b2 = new Book(250);
        System.out.println(Book.count);
        System.out.println(b1.price + " " + b2.price);
    }
}

// Base Class
class Vehicle {
    void print() {
        System.out.println("Base class (Vehicle)");
    }
}

class Car extends Vehicle {
    void print() {
        System.out.println("Derived class (Car)");
    }
}

class Book {
    int price;
    static int count;

    public Book(int price) {
        this.price = price;
        count++;
    }
}

class Automobile {

}