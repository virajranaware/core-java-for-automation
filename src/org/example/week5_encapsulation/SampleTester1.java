package org.example.week5_encapsulation;

public class SampleTester1 {
    public static void main(String[] args) {
       // Sample s1 = new Sample();
       // <DataType> <name> = <Value>

        Sample1 sample = Sample1.getSample();
        System.out.println(sample);

        Sample1 sample1 = Sample1.getSample();
        System.out.println(sample1);

        Sample1 sample2 = Sample1.getSample();
        System.out.println(sample2);

        Sample1 sample3 = Sample1.getSample();
        System.out.println(sample3);
    }
}
