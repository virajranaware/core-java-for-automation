package org.example.week4;

public class MainClass3 {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();

        noteBook.openNotebook();
        noteBook.useNotebook();

        NoteBook noteBook2 = new NoteBook();
        NoteBook noteBook3 = noteBook;

        System.out.println("Value of reference variable noteBook is : "+ noteBook);
        System.out.println("Value of reference variable noteBook2 is : "+ noteBook2);
        System.out.println("Value of reference variable noteBook3 is : "+ noteBook3);
    }
}
