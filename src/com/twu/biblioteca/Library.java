package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookList;
    PrintStream printStream;

    public Library(ArrayList<Book> bookList, PrintStream printStream) {
        this.bookList = bookList;
        this.printStream = printStream;

    }

    public void printBookList() {
        for (Book book : bookList) {
            printStream.println(book);
        }
    }
}
