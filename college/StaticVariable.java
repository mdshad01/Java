
public class StaticVariable {
    String name;
    int roll;

    static String college = "NSU";

    // Constructor
    StaticVariable(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    void dispaly() {
        System.out.println("Name: " + name + ", " + "Roll no : " + roll + ", " + " College : " + college);
    }

    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable("Bj", 31);
        s1.dispaly();
    }
}
