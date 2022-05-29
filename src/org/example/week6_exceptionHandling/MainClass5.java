package org.example.week6_exceptionHandling;

public class MainClass5 {
    public static void main(String[] args) {

        System.out.println("Start");
        int[] arr = {1, 23, 11, 2, 45};

        try {
            System.out.println(arr[5]);
        } finally {
            System.out.println("Finally");
        }
        System.out.println("Finish");
    }
}
/*
Start
Finally

 */

