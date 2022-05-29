package org.example.week6_exceptionHandling;

public class MainClass7 {
    public static void main(String[] args) {
        System.out.println("Start");
        String str = null;
        findLengthOfString(str);
        System.out.println("Stop");
    }

    static void findLengthOfString(String string) throws NullPointerException{
        if (string == null){
            System.out.println("String is null, cant calculate length");
        }else{
            System.out.println("Length of string is " + string.length());
        }
    }
}
/*

&&  AND
||  OR
!   NOT

 */