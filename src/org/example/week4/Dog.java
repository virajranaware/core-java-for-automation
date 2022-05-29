package org.example.week4;

public class Dog {
    String name;
    int age;

    Dog(){
    }

     Dog(String name){
        this.name = name;
        System.out.println("Value of this is: " + this);
    }

    Dog(int age){
        this.age = age;
    }

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    Dog(int age, String name){
        this.name = name;
        this.age = age;
    }

    void bark(){
        System.out.println(name + " is barking...");
    }

}
