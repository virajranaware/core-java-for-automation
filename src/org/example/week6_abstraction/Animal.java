package org.example.week6_abstraction;

public abstract class Animal {
    int age;

    abstract void makeNoise();  // simulate animal noise -> Abstract Method

    void eat(){                 // -> Concrete Method
        System.out.println("Animal is eating..!");
    }
}
