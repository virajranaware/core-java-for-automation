package org.example.week6_exceptionHandling;

public class MainClass2 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] arr = {1, 23, 11, 2, 45};

        try {
            System.out.println(arr[4]);           //  -->  new Exception()
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Error Occurred");
        }
        System.out.println("More Code..!");
        System.out.println("Finish");
    }
}
