package org.example.week7;

import java.util.LinkedList;

public class MainClass2 {
    public static void main(String[] args) {

        // DataType varName = Value
        // ArrayList
        // ArrayList<String> myList = new ArrayList<>();
        LinkedList<String> myList = new LinkedList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("JavaScript");
        myList.add("SQL");
        myList.add("Java");
        myList.add("Java");

        System.out.println("Size of the list is: " + myList.size());

        for (String str : myList) {
            System.out.println(str);
        }

    }
}

/*
Before----
Size of the list is: 4
Java
Python
JavaScript
SQL

After adding Java again----
Size of the list is: 5
Java
Python
JavaScript
SQL
Java


Retrieve values from list :- ArrayList
Add/Remove Values :- LinkedList

Duplicates are allowed in List
 */