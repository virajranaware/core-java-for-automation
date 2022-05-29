package org.example.week4;

public class DogTester {
    public static void main(String[] args) {
        Dog d1 = new Dog("Moti");
        System.out.println("Dog name is : "+ d1.name);
        System.out.println("Value of d1 is: "+ d1);
        d1.bark();

        System.out.println();

        Dog d2 = new Dog("Tomi");
        System.out.println("Dog name is : "+ d2.name);
        System.out.println("Value of d2 is: "+ d2);
        d2.bark();

        System.out.println();

        Dog d3 = new Dog("Rocky", 20);
        System.out.println("Dog name is : "+ d3.name);
        System.out.println("Dog age is : "+ d3.age);
        d3.bark();
        d3.age = 22;
        System.out.println("Dog age is : "+ d3.age);
        d3.age = 23;
        System.out.println("Dog age is : "+ d3.age);

        System.out.println();

        Dog d4 = new Dog();
        System.out.println("Dog name is : "+ d4.name);
        System.out.println("Dog age is : "+ d4.age);
    }
}
