public class StaticBlock {
    static int number;

    // static block

    static {
        System.out.println("Static block is executed.");
        number = 100;
    }

    public static void main(String[] args) {
        System.out.println("Main methos is executed");
        System.out.println("Number = " + number);
    }
}
