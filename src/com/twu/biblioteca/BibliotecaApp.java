package com.twu.biblioteca;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaApp {
    private PrintStream printStream;


    public static void main(String[] args) {
        BibliotecaApp app = new BibliotecaApp(System.out);
        Book[] bookList = {
                new Book("Catch 22", "Joseph Heller", "1967"),
                new Book("Call Me By Your Name", "Andre Aciman", "1964"),
                new Book("In Search of Lost Time","Marcel Proust","1913"),
                new Book("Don Quixote","Miguel de Cervantes","2094"),
                new Book("Moby Dick","Herman Melville","1851"),
                new Book("Hamlet","William Shakespeare","1599")
        };

        Library lib = new Library(new ArrayList<Book>(Arrays.asList(bookList)), System.out);

        app.printGreeting();
        app.printOptions();
    }


    public BibliotecaApp(PrintStream ps) {
        printStream = ps;

    }

    public void printGreeting() {
        printStream.println("Welcome to Biblioteca!\n");
    }

    public void printOptions() {
        printStream.println("1) Quit \n2) Checkout Book \n3) Return Book \n4) List Books\n");
    }


}
