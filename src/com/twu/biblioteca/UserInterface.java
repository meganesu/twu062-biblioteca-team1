package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class UserInterface {
    private PrintStream printStream;
    private BufferedReader input;

    public UserInterface(PrintStream printStream, BufferedReader in) {
        this.printStream = printStream;
        this.input = in;
    }

    public void printMessage(String message) {
        printStream.println(message);
    }

    public String getUserInput() throws IOException {
        return input.readLine();
    }

    public void printBookListString(ArrayList<Book> bookList) {
        String bookListString = getBookListString(bookList);
        printMessage( bookListString );
        
    }

    public String getBookListString(ArrayList<Book> bookList) {
        StringBuilder bookListStringBuilder = new StringBuilder();
        for (Book book: bookList) {
            if(!book.isCheckedout())
                bookListStringBuilder.append(book.toString() + "\n");
        }
        return bookListStringBuilder.toString();
    }

}
