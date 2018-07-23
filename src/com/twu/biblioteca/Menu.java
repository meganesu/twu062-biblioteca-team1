package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Menu {

    //TODO: REPLACE THIS WITH OPTIONS
    ArrayList<String> menuOptions;


    public enum MenuCode {
        BookList,
        Checkout,
        Quit,
        Invalid
    }


    private final Library lib;
    private final UserInterface ui;

    public Menu(PrintStream printStream, BufferedReader bufferedReader, ArrayList<Book> bookList) {
        this.lib = new Library(bookList);
        this.ui = new UserInterface(printStream, bufferedReader);

        addMenuOptions();
    }

    private void addMenuOptions() {
        menuOptions = new ArrayList<String>();

        this.menuOptions.add("List Books");
        this.menuOptions.add("Check Out Book");
        this.menuOptions.add("Return Book");
        this.menuOptions.add("Quit");
    }

    public Menu(UserInterface ui, Library lib) {
        this.ui = ui;
        this.lib = lib;
        addMenuOptions();

    }


    public void launch() throws IOException {
        printGreeting();
        boolean keepRunning = true;
        while (keepRunning) {
            printOptions();
            keepRunning = doRequest();
        }
    }

    public void printOptions() {
        String s = "";
        for (int i = 0; i < menuOptions.size(); i++) {
            s += i + 1 + ") " + menuOptions.get(i) + "\n";
        }
        ui.printMessage(s);
    }

    public void printGreeting() {
        ui.printMessage("Welcome to Biblioteca!\n");
    }

    public MenuCode parseIntToMenuCode(int i) {
        switch (i) {
            case 1:
                return MenuCode.BookList;
            case 2:
                return MenuCode.Checkout;
            case 4:
                return MenuCode.Quit;

        }
        return MenuCode.Invalid;
    }

    public boolean executeInput(MenuCode i) {

        switch (i) {
            case BookList:
<<<<<<< HEAD
                ui.printMessage(lib.getBookListString());
                return true;
=======
                return ui.printBookList();
>>>>>>> AT/NJ refactored getBookList method to now return list
            case Checkout:
                ui.printMessage("Thank you! Enjoy the book");
                return true;
            case Quit:
                ui.printMessage("Goodbye!");
                return false;
        }
        ui.printMessage("That's not an option. Try again");
        return true;
    }

    public boolean doRequest() throws IOException {
        String userInput = ui.getUserInput();

        // TODO: assume for now the userInput is fine

        MenuCode menuCode = parseIntToMenuCode(Integer.parseInt(userInput));
        return executeInput(menuCode);
    }

}
