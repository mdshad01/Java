class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;

    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum(10, 20));
        System.out.println(c.sum(10, 20, 30));
    }
}