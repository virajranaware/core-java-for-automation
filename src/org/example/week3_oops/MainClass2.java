package org.example.week3_oops;

public class MainClass2 {
    public static void main(String[] args) {

        System.out.println("Value of k is: " + DemoClass2.k);
        System.out.println("Value of d is: " + DemoClass2.d);

        DemoClass2.k= 12;
        DemoClass2.d = 12.12;
        System.out.println("Value of k is: " + DemoClass2.k);
        System.out.println("Value of d is: " + DemoClass2.d);

        DemoClass2.display();
        DemoClass2.test();
    }
}