package org.example.week6_abstraction;

public class AnimalTester {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeNoise();
        dog.eat();

        System.out.println();

        Cat cat = new Cat();
        cat.makeNoise();
        cat.eat();
    }
}
