package org.example.week5_polymorphism;

import org.example.week5.Demo2;

public class AccessSpecifierTester2 extends Demo2 {
    public static void main(String[] args) {

        AccessSpecifierTester2 as2 = new AccessSpecifierTester2();
        as2.displayN2();
        System.out.println("N1 value is: "+ as2.n1);
    }
}
