package org.example.week3;

public class MainClass6 {
    public static void main(String[] args) {
        int[] arr3 = {12, 23, 5, 11, 34, 56, 21};

        int sum = 0;
        // sum = sum + arr3[index]

        for (int i = 0; i < arr3.length; i++){
            sum = sum + arr3[i];                //-> sum += arr3[i];  sum *= arr3[i]  -> sum = sum * arr[i]
        }
        System.out.println("The sum is: " + sum);
    }
}


// int[] arr3 = {12, 23, 5, 11, 34, 56, 21};
// find the sum of all elements

//{12, 23, 5, 11, 34, 56, 21}
// 0 + 12 = 12
// 12 + 23 = 35
