package org.example.week4;

public class MainClass4 {
    static int k;

    static
    {
        System.out.println("Running static block1 of MainClass4");
        k = 10;
    }

    public static void main(String[] args) {
        System.out.println("Program started.");
        System.out.println(k);

        Sample4 sample4 = new Sample4();  // create an object
//        sample4.test();

        System.out.println("Program ended.");
    }
    static
    {
        System.out.println("Running static block2 of MainClass4");
    }

    static
    {
        System.out.println("Running static block3 of MainClass4");
    }
}