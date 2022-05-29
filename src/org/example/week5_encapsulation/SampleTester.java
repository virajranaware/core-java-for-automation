package org.example.week5_encapsulation;

public class SampleTester {
    public static void main(String[] args) {
       // Sample s1 = new Sample();
       // <DataType> <name> = <Value>

        Sample s1 = Sample.getSample();
        System.out.println(s1);

        System.out.println("Value of i is: " + s1.i);

        Sample s2 = Sample.getSample();
        System.out.println(s2);

        Sample s3 = Sample.getSample();
        System.out.println(s3);

        Sample s4 = Sample.getSample();
        System.out.println(s4);
    }
}
