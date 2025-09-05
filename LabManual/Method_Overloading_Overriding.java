// package LabManual;

// class Animal {
// // Method Overloading
// void sound() {
// System.out.println("Animal makes a sound");
// }

// void sound(String type) {
// System.out.println("Animal makes a " + type + " sound");
// }
// }

// class Dog extends Animal {
// // Method Overriding
// @Override
// void sound() {
// System.out.println("Dog barks");
// }

// // Method Overloading
// void sound(int times) {
// System.out.println("Dog barked " + times + " times");
// }
// }

// public class Method_Overloading_Overriding {
// public static void main(String[] args) {
// Animal a = new Animal();
// a.sound(); // Animal's method
// a.sound("generic"); // Overloaded in Animal

// Dog d = new Dog();
// d.sound(); // Overridden method
// d.sound("loud"); // Inherited overloaded method
// d.sound(3); // Overloaded in Dog
// }
// }
