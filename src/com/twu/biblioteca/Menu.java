package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Menu {

    //TODO: REPLACE THIS WITH OPTIONS
    ArrayList<String> menuOptions;


    public enum MenuCode {
        BookList,
        Checkout,
        Invalid
    }


    private final Library lib;
    private final UserInterface ui;

    public Menu(PrintStream printStream, BufferedReader bufferedReader,ArrayList<Book> bookList) {
        this.lib = new Library(bookList);
        this.ui = new UserInterface(printStream,
                bufferedReader);

        menuOptions = new ArrayList<String>();
        this.menuOptions.add("List Books");
        this.menuOptions.add("Check Out Book");
        this.menuOptions.add("Return Book");
        this.menuOptions.add("Quit");
    }


    public void launch() throws IOException {
        printGreeting();
        printOptions();
        doRequest();
    }

    public void printOptions() {
        String s = "";
        for (int i = 0; i < menuOptions.size(); i++) {
            s += i+1 + ") " + menuOptions.get(i) + "\n";
        }
        ui.printMessage(s);
    }

    public void printGreeting() {
        ui.printMessage("Welcome to Biblioteca!\n");
    }

    public MenuCode parseIntToMenuCode (int i) {
        switch (i) {
            case 1:
                return MenuCode.BookList;
            case 2:
                return MenuCode.Checkout;

        }
        return MenuCode.Invalid;
    }

    public String executeInput(MenuCode i) {


        switch (i) {
            case BookList:
                return lib.getBookListString();
            case Checkout:
                return "Thank you! Enjoy the book";
        }
        return null;
    }

    public void doRequest() throws IOException {
        String userInput = ui.getUserInput();

        // TODO: assume for now the userInput is fine

        MenuCode menuCode = parseIntToMenuCode(Integer.parseInt(userInput));
        String response = executeInput(menuCode);

        ui.printMessage(response);
    }

}
