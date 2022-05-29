package org.example.week4;

public class Sample5 {
    static int i = 5;

    static
    {
        System.out.println("Running static block1 of Sample5.");
    }

    {
        System.out.println("Running non-static block1 of Sample5.");
    }

    void test(){
        System.out.println("Running test() method of Sample5");
    }

    static
    {
        System.out.println("Running static block2 of Sample5.");
    }
}