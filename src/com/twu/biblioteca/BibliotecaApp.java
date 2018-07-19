package com.twu.biblioteca;

import java.io.*;

public class BibliotecaApp {
    private PrintStream printStream;

    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp(System.out);
        app.printGreeting();
        app.printOptions();
    }


    public BibliotecaApp(PrintStream ps) {
            printStream = ps;
        }

        public void printGreeting () {
            printStream.println("Welcome to Biblioteca!\n");
        }

        public void printOptions () {
            printStream.println("1) Quit \n2) Checkout Book \n3) Return Book \n4) List Books");
        }

}
