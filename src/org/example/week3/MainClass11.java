package org.example.week3;

public class MainClass11 {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println("Length of the string is: "+ str.length());

        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-2));

        String str1 = "HeLlO";
        String str2 = "Hello";

        System.out.println("Are strings equal: " + (str1 == str2));
        System.out.println("Are strings equal: " + str1.equals(str2));

        System.out.println("Concatenated strings: "+ str1.concat(str2));

        System.out.println("To uppercase: "+ str1.toUpperCase());
        System.out.println("To lowercase: "+ str1.toLowerCase());


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

 */