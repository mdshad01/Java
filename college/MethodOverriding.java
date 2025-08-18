class Bank {
    double getIntrestRate() {
        return 0;
    }
}

class SBI extends Bank {
    @Override
    double getIntrestRate() {
        return 2.5; // SBI'S Specific interestrate
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bank b1 = new SBI(); // upcasting
        System.out.println(b1.getIntrestRate());
    }
}
