import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("Hello, Everyone");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        try {
            if (y != 0) {
                double result = x / y;
                System.out.println("It's mathematically correct " + "result : " + result);
            } else {
                System.out.println("It's not mathematically correct you can't divide any number by zero");
            }

        } catch (Exception e) {
            System.out.println("It's not mathematically correct");
        }
        System.out.println("Hi, I'm Shad");
    }
}
