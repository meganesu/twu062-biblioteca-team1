package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

    static ArrayList<Book> testBookList = new ArrayList<Book>(Arrays.asList(new Book(0,"Catch 22","Joseph Heller","1967"),
            new Book(1,"ABC", "Nygel", "2018")));

    @Test
    public void shouldReturnListOfBooks() {
        PrintStream printStream = mock(PrintStream.class);
        ArrayList<Book> bookList = new ArrayList<Book>(Arrays.asList(new Book(0,"Catch 22","Joseph Heller","1967")));
        Library lib = new Library(new ArrayList<Book>(bookList));

        assertEquals(bookList.get(0).toString() + "\n",lib.getBookListString());
    }

    @Test
    public void shouldNotShowCheckedOutBookInBookList() {
        ArrayList<Book> bookList = new ArrayList<Book>(Arrays.asList(new Book(0,"Catch 22","Joseph Heller","1967")));
        Library lib = new Library(new ArrayList<Book>(bookList));

        lib.checkout(0);
        assertEquals("",lib.getBookListString());
    }
}
