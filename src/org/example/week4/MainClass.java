package org.example.week4;

public class MainClass {
    public static void main(String[] args) {

        // create object:-  <ClassName>  <objectName> = new  <ClassName>();
        Sample sampleObject = new Sample();

        // Access non static members using object name/object reference.
        System.out.println("Value of j is: "+ sampleObject.j);
        System.out.println("Value of d is: "+ sampleObject.d);

        sampleObject.j = 100;
        sampleObject.d = 100.11;

        System.out.println("Value of j is: "+ sampleObject.j);
        System.out.println("Value of d is: "+ sampleObject.d);

        sampleObject.test();

    }
}
