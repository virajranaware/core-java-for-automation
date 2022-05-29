package org.example.week3;

public class MainClass5 {
    public static void main(String[] args) {

        // method 1
        int[] arr1;          // Declaration
        arr1 = new int[5];   // Initialization

        // method 2
        int[] arr2 = new int[5];    // Declaration + Initialization

        // method 3
        int[] arr3 = {12, 23, 5, 11, 34, 56, 21};
//        double[] arr3 = {12.1, 23, 5, 11, 34, 56, 21};
        System.out.println("Array size : "+ arr3.length);

        for (int i = 0; i < arr3.length ; i++){
            System.out.println("Element at index " + i + " is: " + arr3[i]);
        }
    }
}
