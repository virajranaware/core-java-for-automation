package org.example.week7;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        // DataType varName = Value
        // ArrayList
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Java");
        myList.add("Python");
        myList.add("JavaScript");

        System.out.println(myList.get(2));

        myList.add("Ruby");
        myList.add("SQL");
        myList.add("HTML");

        System.out.println("Size of the list is: "+ myList.size());
        System.out.println();

        myList.add(4,"Test");

        for (int i=0; i< myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}

/*
Integer
Float
Double

add
get
size

O/P After adding Test
        Java
        Python
        JavaScript
        Ruby
        Test
        SQL
        HTML
 */