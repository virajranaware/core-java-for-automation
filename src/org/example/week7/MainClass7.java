package org.example.week7;

import java.util.HashMap;

public class MainClass7 {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(12, "Sonam");
        students.put(21, "Shrikant");
        students.put(34, "Vidya");
        students.put(40, "Vinod");
        students.put(11, "Sonam");

        System.out.println(students.get(40));

        students.put(40, "Kirti");

        System.out.println(students.get(40));        // retrieve elements using key

        students.remove(34);

        for (Integer key : students.keySet()){
            System.out.println(key + " " + students.get(key));
        }
    }
}

/*
Key Value -> Map data structure

RollNo and Name
1 - Sonam
2 - Shrikant
3 - Vidya
4 - Vinod

State - Capital
Maharashtra - Mumbai
Delhi - Delhi

 */
