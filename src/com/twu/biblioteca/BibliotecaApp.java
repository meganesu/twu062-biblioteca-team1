package com.twu.biblioteca;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class BibliotecaApp {
    private PrintStream printStream;
    private Menu menu;


    public static void main(String[] args) throws IOException {

        ArrayList<Book> bookList = new ArrayList<Book> (Arrays.asList(new Book(0,"Catch 22", "Joseph Heller", "1967"),
                new Book(1,"Call Me By Your Name", "Andre Aciman", "1964"),
                new Book(2,"In Search of Lost Time","Marcel Proust","1913"),
                new Book(3,"Don Quixote","Miguel de Cervantes","2094"),
                new Book(4,"Moby Dick","Herman Melville","1851"),
                new Book(5,"Hamlet","William Shakespeare","1599")));

        Menu menu = new Menu(System.out,new BufferedReader(new InputStreamReader(System.in)),bookList);
        menu.launch();
    }


    public BibliotecaApp(PrintStream ps) {
        printStream = ps;

    }

}
