package org.example.week7;

import java.util.HashSet;

public class MainClass3 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(23);
        hashSet.add(21);
        hashSet.add(2);

        System.out.println(hashSet.size());
        System.out.println();

        for(Integer i : hashSet){
            System.out.println(i);
        }

        System.out.println();

        hashSet.remove(21);
        System.out.println(hashSet.size());
        for(Integer i : hashSet){
            System.out.println(i);
        }
    }
}
