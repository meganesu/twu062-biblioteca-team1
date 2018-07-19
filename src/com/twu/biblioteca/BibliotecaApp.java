package com.twu.biblioteca;

import java.io.*;

public class BibliotecaApp {
    private PrintStream printStream;

    public BibliotecaApp(PrintStream ps) {
        printStream = ps;
    }

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    public void printGreeting() {
        printStream.println("Welcome to Biblioteca!");
    }
}
