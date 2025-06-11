//package Opps_java;

public class MultipleInterfaces {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
    }
}

interface Herbivores {
    void eat();
}

interface Carnivores {
    void eat();
}

class Bear implements Herbivores, Carnivores {
    public void eat() {
        System.out.println("Eat both plants and animal");
    }
}