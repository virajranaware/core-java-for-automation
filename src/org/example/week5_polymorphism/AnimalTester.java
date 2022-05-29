package org.example.week5_polymorphism;

public class AnimalTester {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeNoise();

        Dog dog = new Dog();
        dog.makeNoise();

        Cat cat = new Cat();
        cat.makeNoise();

    }
}
