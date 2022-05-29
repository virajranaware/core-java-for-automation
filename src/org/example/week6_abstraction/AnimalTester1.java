package org.example.week6_abstraction;

public class AnimalTester1 {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.makeNoise();

        Animal1 a1 = new Dog1();
        a1.makeNoise();

        a1 = new Cat1();
        a1.makeNoise();
    }
}