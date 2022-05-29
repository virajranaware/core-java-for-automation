package org.example.week3;

public class MainClass7 {
    public static void main(String[] args) {
        System.out.println("Program started..");
        int[] arr3 = {12, 23, 5, 11, 34, 56, 21};
        printArray(arr3);
        System.out.println("Program finished..");
    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
