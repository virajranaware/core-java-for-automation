package org.example.week3;

public class Assignment4 {
    public static void main(String[] args) {

        double[] arr = new double[5]; // declaration + initialization

        arr[0] = 10.2;
        arr[1] = 2.20;
        arr[2] = 1.11;
        arr[3] = 2.20;
        arr[4] = 1.11;

        for (int i = 0; i <= 4; i++){
            System.out.println(arr[i]);
        }
    }
}

// Create array to accept fractional number - double, size = 5, print using for loop
// 0 1 2 3 4
// ArrayIndexOutOfBoundsException - this is thrown if we try to access index beyond array length