package org.example.week6_exceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Program Started..!");
        int i = 12;
        int j = 0;
        try{
            int k = i / j;      // (12 / 0)
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Program Finished..!");
    }
}