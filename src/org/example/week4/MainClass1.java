package org.example.week4;

public class MainClass1 {
    public static void main(String[] args) {

        System.out.println("Value of j is: " + Sample1.j);

        Sample1 sampleObject1 =  new Sample1();
        System.out.println("Value of d is : "+ sampleObject1.d);
        System.out.println("Value of j is: " + Sample1.j);

        Sample1 sampleObject2 = new Sample1();
        System.out.println("Value of d is : "+ sampleObject2.d);
        System.out.println("Value of j is: " + Sample1.j);

        Sample1.j = 11;
        System.out.println("Value of j is: " + Sample1.j);

        sampleObject1.d = 11.11;
        System.out.println("Value of d is : "+ sampleObject1.d);
        System.out.println("Value of d is : "+ sampleObject2.d);

    }
}
