package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

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
    public void shouldReturnTrueAndPrintBookListWhenGivenInput1() {

        boolean response = menu.executeInput(Menu.MenuCode.BookList);
        verify(printStream).println(lib.getBookListString());
        assertTrue(response);
    }

    @Test
    public void shouldReturnTrueAndPrintMessageIfBookWasCheckedOutSuccessfully()
    {
        boolean response = menu.executeInput(Menu.MenuCode.Checkout);
        verify(printStream).println("Thank you! Enjoy the book");
        assertTrue(response);
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

    @Test
    public void shouldAcceptMultipleInputsUntilQuitAndNoneAfter() throws IOException {

        when(input.readLine()).thenReturn("1").thenReturn("1").thenReturn("4").thenReturn("1");

        Library mockLib = mock(Library.class);
        Menu mockMenu = new Menu(ui, mockLib);

        mockMenu.launch();

        verify(mockLib, times(2)).getBookListString();

        verify(printStream).println("Goodbye!");


    }
}
