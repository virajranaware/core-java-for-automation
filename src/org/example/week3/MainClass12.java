package org.example.week3;

public class MainClass12 {

    public static void main(String[] args) {

        String original = "Hello World";
        String reversed = "";
        int i = original.length()-1;

        while (i >= 0){
            reversed = reversed + original.charAt(i);
            i--;
        }

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
}

/*
Loop:
    for (int i = original.length()-1; i >= 0; i--)

    int i = original.length()-1 --> Starting point for loop counter
    i >= 0                      --> Condition
    i--                         --> Operation on counter

 Assignment: Use while loop for all loop problems done so far

 */
