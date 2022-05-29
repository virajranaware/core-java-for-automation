package org.example.week4;

public class Sample4 {

    int i = 11;

    {
        System.out.println("Running non-static block1 of Sample4");
    }

    void test(){
        System.out.println("Running test() of Sample4.");
    }

    {
        System.out.println("Running non-static block2 of Sample4");
    }

    {
        System.out.println("Running non-static block3 of Sample4");
    }
}
