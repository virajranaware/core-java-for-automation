package org.example.week5;


public class InheritanceTester1 {
    public static void main(String[] args) {
//        Sample1 s1 = new Sample1(10);
        Test1 t1 = new Test1();

        EmptyClass emptyClass = new EmptyClass();
    }
}

// main() --> new Test1() --> Test1() --> Sample1() --> super() --> Demo1() --> Sample1()  --> Test1()  --> main()