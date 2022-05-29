package org.example.week4_inheritance;

public class AnimalTester {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.age = 10;
        System.out.println("Animal age is: "+ animal.age);
        animal.eat();
        animal.makeNoise();

        System.out.println("************************************");

        Dog d1 = new Dog();
        d1.age = 12;
        System.out.println("Dog age is: " + d1.age);
        d1.eat();
        d1.makeNoise();


        System.out.println("************************************");

        Cat c1 = new Cat();
        c1.age = 5;
        System.out.println("Cat age is: "+ c1.age);
        c1.eat();
        c1.makeNoise();

    }
}
