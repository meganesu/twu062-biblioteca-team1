package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class UserInterfaceTest {
    private BufferedReader input;
    UserInterface ui;
    PrintStream printStream;

    @Before
    public void setUp() {
        input = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        ui = new UserInterface(printStream, input);
    }

    @Test
    public void shouldPrintMessageToConsole() {
        ui.printMessage("Hello");
        verify(printStream).println("Hello");
    }

    @Test
    public void shouldGetInputFromUser() throws IOException {
        ui.getUserInput();
        verify(input).readLine();
    }

}
