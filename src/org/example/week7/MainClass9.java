package org.example.week7;

public class MainClass9 {
    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = new String("Hello World");
        String str3 = "Hello World";
        String str4 = new String("Hello World");
        String str5 = "Hello World";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println("************************");

        System.out.println(str1 == str2);       // false
        System.out.println(str1.equals(str2));  // true
        System.out.println("************************");

        System.out.println(str1 == str3);       // true
        System.out.println(str1.equals(str3));  // true
        System.out.println("************************");

        System.out.println(str2 == str4);       // true
        System.out.println(str2.equals(str4));  // true

        System.out.println("************************");
    }
}
