package org.example.week5_encapsulation;

public class DemoTester {
    public static void main(String[] args) {

        Demo d1 = new Demo(11, false);
        System.out.println(d1.getI());
        System.out.println(d1.getB());

        d1.setI(12);
        System.out.println(d1.getI());

        d1.setI(20);
        System.out.println(d1.getI());

        System.out.println();

        Demo d2 = new Demo(11, true);
        System.out.println(d2.getI());

        System.out.println(d1.getI());

    }
}
