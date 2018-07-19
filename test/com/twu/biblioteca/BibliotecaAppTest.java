package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

    @Test
    public void shouldPrintGreeting() {
        PrintStream printStream = mock(PrintStream.class);
        BibliotecaApp app = new BibliotecaApp(printStream);
        app.printGreeting();
        verify(printStream).println("Welcome to Biblioteca!");
    }

    @Test
    public void showListOfOptions () {

        PrintStream printStream = mock(PrintStream.class);
        BibliotecaApp app = new BibliotecaApp((printStream));
        app.printOptions();

        }
}
