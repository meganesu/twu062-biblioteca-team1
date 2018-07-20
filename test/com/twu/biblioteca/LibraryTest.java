package com.twu.biblioteca;

import org.junit.Ignore;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class LibraryTest {

    @Test
    public void shouldReturnListOfBooks() {
        PrintStream printStream = mock(PrintStream.class);
        ArrayList<Book> bookList = new ArrayList<Book>(Arrays.asList(new Book[] {
                new Book("Catch 22","Joseph Heller","1967")
        }));
        Library lib = new Library(new ArrayList<Book>(bookList), printStream);

        assertEquals(bookList,lib.getBookList());
    }
}
