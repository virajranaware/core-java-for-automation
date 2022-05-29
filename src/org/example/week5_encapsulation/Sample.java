package org.example.week5_encapsulation;

public class Sample {

    int i = 100;
    private Sample(){
        System.out.println("Sample constructor..!");
    }

    public static Sample getSample(){
      return new Sample();
    }
}

/*
sigleton Pattern


 */