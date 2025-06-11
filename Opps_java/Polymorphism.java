//package Opps_java;

public class Polymorphism {
    public static void main(String[] args) {
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(2,2));
        // System.out.println(calc.sum(2.5,3.5));
        // System.out.println(calc.sum(2,2,2));
        Dear d1 = new Dear();
        d1.eat();

    }
}

// Method overriding
class Animal {
    void eat() {
        System.out.println("Eat any thing");
    }
}

class Dear extends Animal {
    void eat() {
        System.out.println("Eat grass");
    }
}

// Method Overloding
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}