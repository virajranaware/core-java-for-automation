package org.example.week3;

public class MainClass13 {
    public static void main(String[] args) {

        String message = "Good Morning..!";

        System.out.println(message.endsWith("ning..!"));
        System.out.println(message.indexOf('o'));
        System.out.println(message.substring(5));
        System.out.println(message.substring(5, 12));       // beginIndex-> inclusive, endIndex-> exclusive
                                                            // characters at beginIndex to endIndex - 1
        String message1 = "GOod moRnIng..!";

       // System.out.println(message.compareTo(message1));

        System.out.println(message.equalsIgnoreCase(message1));
        System.out.println("*****************************");

        String message2 = "We_are_learning_Java";

        String[] strArray = message2.split("_");
        int index = 0;

        while (index < strArray.length){
            System.out.println(strArray[index]);
            index++;
        }
    }
}

// Method can accept array & method can return array
