package org.example.week3;

public class Assignment6 {
    public static void main(String[] args) {

        String original = "Hello World";
        String reversed = "";

        for (int i = original.length()-1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
}


/*
Methods in Strings:
length()    -> finds length of the string
charAt()    -> get character from string
concat()    -> concatenate the strings
equals()    -> to compare two strings
replace()   -> to replace a character

Assignment:

Reverse the String with methods given above.

String str = "Java"
output -> "avaJ"

--------
Logic:
        - First, find out length -> "length()"
        - Traverse string from last index, keep upending characters

        "Jav"
        Iteration 1:-		a
        Iteration 2:-		a+v 	= av
        Iteration 3:-		av+a 	= ava
        Iteration 4:-		ava+J 	= avaJ
 */