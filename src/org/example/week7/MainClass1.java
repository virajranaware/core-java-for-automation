package org.example.week7;

import java.util.ArrayList;

public class MainClass1 {
    public static void main(String[] args) {

        // DataType varName = Value
        // ArrayList
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("JavaScript");
        myList.add("SQL");

        System.out.println("Size of the list is: " + myList.size());

        for (String str : myList) {
            System.out.print(str);
            System.out.println(" " + str.length());
        }
        System.out.println("***************");
        myList.remove(2);
        System.out.println(myList.size());

        for (String str : myList) {
            System.out.print(str);
            System.out.println(" " + str.length());
        }
    }
}

/*
Java
Python
JavaScript
SQL

Java
Python
SQL
 */