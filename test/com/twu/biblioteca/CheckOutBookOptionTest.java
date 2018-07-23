package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CheckOutBookOptionTest {

    private UserInterface ui;
    private Library lib;
    private PrintStream printStream;
    private BufferedReader input;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        input = mock(BufferedReader.class);

        ui = new UserInterface(printStream, input);
        lib = new Library(LibraryTest.testBookList);
    }

    @Test
    public void shouldReturnTrueAfterExecute() {
        CheckoutBookOption option = new CheckoutBookOption(lib, ui);
        assertTrue(option.execute());
    }

    @Test
    public void shouldChangeIsCheckedOutToTrueWhenBookIsCheckedOutSuccessfully() throws IOException {
        Library library = mock(Library.class);
        CheckoutBookOption option = new CheckoutBookOption(library, ui);

        when(ui.getUserInput()).thenReturn("0");
        option.execute();



        verify(library).checkout(0);
        verify(printStream).println("Enter the ID of the book you wish to check out.");
        verify(printStream).println("Enjoy your book!");


    }

}
