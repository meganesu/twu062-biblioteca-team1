package com.twu.biblioteca;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class InvalidOptionTest {

    @Test
    public void shouldRespondIfBadNumericalInput() throws IOException {
        PrintStream printStream = mock(PrintStream.class);
        BufferedReader input = mock(BufferedReader.class);

        Menu menu = new Menu(new UserInterface(printStream, input),
                new Library(LibraryTest.testBookList));

        when(input.readLine()).thenReturn("-99");

        menu.doRequest();

        verify(printStream).println("Select a valid option!");
    }

}