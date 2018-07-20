package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class UserInterface {
    private PrintStream printStream;
    private BufferedReader input;

    public UserInterface(PrintStream printStream, BufferedReader in) {
        this.printStream = printStream;
        this.input = in;
    }

    public void printMessage(String message) {
        printStream.println(message);
    }

    public String getUserInput() throws IOException {
         return input.readLine();
    }
}
