package org.example.week6_exceptionHandling;

public class MainClass6 {
    public static void main(String[] args) {
        System.out.println("Start");
        String str = null;
        try{
        findLengthOfString(str);}catch (NullPointerException e){
            System.out.println("NullPointer exception occurred.");
        }
        System.out.println("Stop");
    }

//    static void findLengthOfString(String string) {
//        try {
//            System.out.println("Length of string is " + string.length());
//        } catch (NullPointerException e) {
//            System.out.println("String you have passed in null.");
//        }

    static void findLengthOfString(String string) throws NullPointerException{
            System.out.println("Length of string is " + string.length());
    }
}