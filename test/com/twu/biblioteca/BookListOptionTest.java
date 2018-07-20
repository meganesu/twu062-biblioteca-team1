package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class BookListOptionTest {

    private ArrayList<Book> bookList;// = new ArrayList<>();
    Library lib;
    UserInterface ui ;//= new UserInterface(new PrintStream(), new BufferedReader());

@Before
        public void setup() {
     bookList = new ArrayList<Book>();

             bookList.add(new Book(0, "Catch 22", "Joseph Heller", "1967"));
             bookList.add(new Book(1, "Call Me By Your Name", "Andre Aciman", "1964"));
             bookList.add(new Book(2, "In Search of Lost Time", "Marcel Proust", "1913"));
             bookList.add(new Book(3, "Don Quixote", "Miguel de Cervantes", "2094"));
             bookList.add(new Book(4, "Moby Dick", "Herman Melville", "1851"));
             bookList.add(new Book(5, "Hamlet", "William Shakespeare", "1599"));




    lib = new Library(bookList);
    BufferedReader input = mock(BufferedReader.class);
    PrintStream printStream = mock(PrintStream.class);

    ui = new UserInterface(printStream, input);
}

    @Test
    public void shouldPrintBookList()
    {
        BookListOption option = new BookListOption(lib, ui);
        assert(option.execute());




        }
}
