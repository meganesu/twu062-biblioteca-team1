package com.twu.biblioteca;

import java.io.*;

public class BibliotecaApp {
    private PrintStream printStream;

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp(System.out);
        app.printGreeting();
    }

    public BibliotecaApp(PrintStream ps) {
        printStream = ps;
    }

    public void printGreeting() {
        printStream.println("Welcome to Biblioteca!");
    }
}
