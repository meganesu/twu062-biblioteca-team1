package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {
    @Test
    public void shouldPrintListOfBooks() {
        PrintStream printStream = mock(PrintStream.class);
        ArrayList<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("Catch 22","Joseph Heller","1967"));
        Library lib = new Library(bookList,printStream);

        String title = "Catch 22";
        String author = "Joseph Heller";
        String year = "1967";
        Book book = new Book(title, author, year);


        Book expected = book;
        lib.printBookList();

        verify(printStream).println(expected);
    }
}
