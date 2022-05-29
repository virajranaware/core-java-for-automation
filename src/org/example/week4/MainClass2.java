package org.example.week4;

public class MainClass2 {
    public static void main(String[] args) {

        NoteBook nb1 = new NoteBook();
        nb1.pages = 100;
        nb1.price = 25.00;
        System.out.println("nb1 pages: "+ nb1.pages);
        System.out.println("nb1 price: "+ nb1.price);

        System.out.println("**********************");

        NoteBook nb2 = new NoteBook();
        nb2.pages = 200;
        nb2.price = 45.00;
        System.out.println("nb2 pages: "+ nb2.pages);
        System.out.println("nb2 price: "+ nb2.price);

        System.out.println("**********************");

        NoteBook nb3 = nb1;
        System.out.println("nb3 pages: "+ nb3.pages);
        System.out.println("nb3 price: "+ nb3.price);

        System.out.println("**********************");

        nb3.pages = 125;
        System.out.println("nb1 pages: "+ nb1.pages);
        System.out.println("nb3 pages: "+ nb3.pages);

        System.out.println("**********************");
    }
}
