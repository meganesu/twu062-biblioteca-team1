package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MenuTest {

    private UserInterface ui;
    private Library lib;
    private Menu menu;
    private PrintStream printStream;
    private BufferedReader input;

    @Before
    public void setup() {
        printStream = mock(PrintStream.class);
        input = mock(BufferedReader.class);

        ui = new UserInterface(printStream, input);
        lib = new Library(LibraryTest.testBookList);

        menu = new Menu(printStream,input,LibraryTest.testBookList);
    }

    @Test
    public void shouldGetBookListWhenGivenInput1() {

        assertEquals(lib.getBookListString(), menu.executeInput(Menu.MenuCode.BookList));

    }

    @Test
    public void shouldReturnIfBookWasCheckedOutSuccessfully()
    {
        assertEquals("Thank you! Enjoy the book", menu.executeInput(Menu.MenuCode.Checkout));
    }

    @Test
    public void shouldMakeUIPrintListOfBooksIf1IsTyped() throws IOException {

        when(input.readLine()).thenReturn("1");

        menu.doRequest();

        verify(printStream).println(lib.getBookListString());
    }


    @Test
    public void shouldPrintGreeting() {
        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);

        Menu menu = new Menu(printStream,bufferedReader,LibraryTest.testBookList);
        menu.printGreeting();
        verify(printStream).println("Welcome to Biblioteca!\n");
    }

    @Test
    public void showListOfOptions () {

        PrintStream printStream = mock(PrintStream.class);
        BufferedReader bufferedReader = mock(BufferedReader.class);

        Menu menu = new Menu(printStream,bufferedReader,LibraryTest.testBookList);
        menu.printOptions();
        verify(printStream).println("1) List Books\n2) Check Out Book\n3) Return Book\n4) Quit\n");






    }
}
