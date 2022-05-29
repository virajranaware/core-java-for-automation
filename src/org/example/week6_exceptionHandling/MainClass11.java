package org.example.week6_exceptionHandling;

public class MainClass11 {
    public static void main(String[] args) {
        System.out.println("Start");
        arithmaticOperations(10, 0);
        System.out.println("Stop");
    }

    static void arithmaticOperations(int n1, int n2){
        try {
            System.out.println("division in : " + n1 / n2);
//            String str = null;
//            System.out.println(str.length());
        }catch (ArithmeticException e){
            System.out.println("Can not divide by zero");
        }catch (NullPointerException e){
            System.out.println("Can not find length of null string");
        }
    }
}

/*
Attempt1:
Start
Can not divide by zero
Stop

Attempt2:
Start
RuntimeException occurred
Stop
 */