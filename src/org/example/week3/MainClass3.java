package org.example.week3;

public class MainClass3 {
    public static void main(String[] args) {

        int[] arr1;  //declaration
        arr1 = new int[5]; // initialisation

        //index 0 - 4
        //arr1[index]

        arr1[0] = 200;
        arr1[2] = 12;
        arr1[4] = 14;

        for (int i = 0; i <= 4; i++) {
            System.out.println(arr1[i]);
        }
    }
}

// Create array to accept fractional number - double, size = 5, print using for loop
