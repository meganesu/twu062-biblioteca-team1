package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Library {

    ArrayList<Book> bookList;
    PrintStream printStream;

    public Library(ArrayList<Book> bookList) {
        this.bookList = bookList;

    }

    public void printBookList() {
        for (Book book : bookList) {
            printStream.println(book);
        }
    }

    public String getBookListString() {
        // don't want to allow other parts of program to edit bookList
        StringBuilder sb = new StringBuilder();
        for (Book book : bookList) {
            sb.append(book.toString() + "\n");
        }
        return sb.toString();
    }
}
