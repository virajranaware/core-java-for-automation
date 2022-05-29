package org.example.week6_exceptionHandling;

public class MainClass8 {
    public static void main(String[] args) {
        System.out.println("Start");
        addDelay(3000);         //3 seconds, 1sec = 1000 milli seconds
        System.out.println("Stop");
    }

    static void addDelay(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
/*

&&  AND
||  OR
!   NOT

 */