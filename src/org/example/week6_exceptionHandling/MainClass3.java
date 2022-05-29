package org.example.week6_exceptionHandling;

public class MainClass3 {
    public static void main(String[] args) {
        System.out.println("Start");
        int[] arr = {1, 23, 11, 2, 45};

        try {
            System.out.println(arr[5]);           //  -->  new Exception()
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Error Occurred");
        }finally {
            System.out.println("Executing Finally Block");
        }
        System.out.println("More Code..!");
        System.out.println("Finish");
    }
}

/*
Index = 4, No exception:

Start
45
Executing Finally Block
More Code..!
Finish

-------
Index = 5,  Exception:

Start
ArrayIndexOutOfBoundsException Error Occurred
Executing Finally Block
More Code..!
Finish
 */