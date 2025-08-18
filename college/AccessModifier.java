public class AccessModifier {
    private int number;

    private void display() {
        System.out.println("Number : " + number);
    }

    public static void main(String[] args) {
        AccessModifier a = new AccessModifier();
        a.number = 100;
        a.display();
    }
}
