package org.example.week5;

public class Demo {
    boolean b;

    Demo(){
        System.out.println("Executing zero-arg constructor of the Demo class");
    }
    Demo(boolean b){
       this.b = b;
        System.out.println("b values is: " + b);
    }
    void view(){
        System.out.println("Running view() of Demo Class.");
    }
}