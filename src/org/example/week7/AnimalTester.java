package org.example.week7;

public class AnimalTester {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeNoise();

        Dog d1 = new Dog();
        d1.eat();
        d1.makeNoise();

        // Up-Casting
        Animal animal1 = new Dog(); // equivalent to   (Animal) new Dog()
        animal1.makeNoise();
        animal1.eat();
    }
}
