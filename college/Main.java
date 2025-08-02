package college;

class Car {
    String name;
    int price;

    Car() {
        System.out.println("Car is created");
    }

    Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println("Brand" + " : " + name + " , " + "Price : " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Honda", 1200000);
        c2.display();
    }
}
