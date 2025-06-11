//package Opps_java;

public class Basic {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); // creating object new object
        // p1.setColor("Green");
        // System.out.println(p1.color);

        // p1.color = "Yellow";
        // System.out.println(p1.color);

        BanckAccount myAcc = new BanckAccount();
        myAcc.setPassword("123abcd");
        myAcc.username = ("Md Shad Alam");
        System.out.println(myAcc.username);
        System.out.println(myAcc.getPassword());

    }
}

class BanckAccount {
    public String username;
    private String password;

    String getPassword() {
        return this.password;
    }

    public void setPassword(String pwd) {
        password = pwd;
    }
}

// class Pen{
// String color;
// int tip;

// void setColor(String newColor){
// color = newColor;
// }
// void setInt(int newInt){
// tip = newInt;
// }

// }