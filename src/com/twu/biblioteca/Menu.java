package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class Menu {

    //TODO: REPLACE THIS WITH OPTIONS
    ArrayList<Option> menuOptions;

    private final Library lib;
    private final UserInterface ui;

    public Menu(PrintStream printStream, BufferedReader bufferedReader, ArrayList<Book> bookList) {
        this.lib = new Library(bookList);
        this.ui = new UserInterface(printStream, bufferedReader);

        addMenuOptions();
    }

    private void addMenuOptions() {
        menuOptions = new ArrayList<Option>();

        this.menuOptions.add(new BookListOption(lib, ui));
        this.menuOptions.add(new CheckoutBookOption(lib, ui));
        this.menuOptions.add(new ReturnBookOption(lib, ui));
        this.menuOptions.add(new QuitOption(lib, ui));
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

    public boolean executeInput(String userInput) {

        if (isValidUserInput(userInput)) {
            int option = Integer.parseInt(userInput);
            return menuOptions.get(option - 1).execute();
        } else {
            return new InvalidOption(lib, ui).execute();
        }
    }

    private boolean isValidUserInput(String userInput) {
        try {
            int optionIndex = Integer.parseInt(userInput);
            if (optionIndex < 1 || optionIndex > menuOptions.size()) {
                return false;
            } else {
                return true;
            }
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean doRequest() throws IOException {
        String userInput = ui.getUserInput();

        // TODO: assume for now the userInput is fine

        return executeInput(userInput);
    }

}
