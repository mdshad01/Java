class Vehicle {
    String brand;
    int price;

    void Display() {
        System.out.println("Brand :" + brand);
        System.out.println("Price :" + price);
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.brand = "Toyota";
        car.price = 1200000;
        car.Display();
    }
}
