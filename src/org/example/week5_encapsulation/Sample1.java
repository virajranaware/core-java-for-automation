package org.example.week5_encapsulation;

public class Sample1 {

    private static Sample1 s1;

    private Sample1(){
        System.out.println("Sample constructor..!");
    }

    public static Sample1 getSample(){
        if (s1 == null){
            s1 = new Sample1();
        }
        return s1;
    }
}

/*
sigleton Pattern


 */