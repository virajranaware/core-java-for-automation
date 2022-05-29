package org.example.week3;

public class MainClass2 {
    public static void main(String[] args) {

        int[] arr1;  //declaration
        arr1 = new int[5]; // initialisation

        arr1[0] = 10;
        arr1[1] = 11;
        arr1[2] = 12;
        arr1[3] = 13;
        arr1[4] = 14;

        System.out.println("*****************");
        for (int i = 0; i <= 4; i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("*****************");
        for (int i = 4; i >= 0; i--){
            System.out.println(arr1[i]);
        }

//        System.out.println("arr1[0]: "+ arr1[0]);
//        System.out.println("arr1[1]: "+ arr1[1]);
//        System.out.println("arr1[2]: "+ arr1[2]);
//        System.out.println("arr1[3]: "+ arr1[3]);
//        System.out.println("arr1[4]: "+ arr1[4]);
//

    }
}
