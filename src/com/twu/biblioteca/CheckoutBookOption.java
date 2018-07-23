package com.twu.biblioteca;

import java.io.IOException;

public class CheckoutBookOption extends Option {

    public CheckoutBookOption(Library lib, UserInterface ui) {
        this.lib = lib;
        this.ui = ui;
    }

    @Override
    public boolean execute() {

        String userInput = null;
        ui.printMessage("Enter the ID of the book you wish to check out.");
        try {
            userInput = ui.getUserInput();
        } catch (IOException e) {
            e.printStackTrace();
        }
        lib.checkout(Integer.parseInt(userInput));
        ui.printMessage("Enjoy your book!");
        return true;
    }

    @Override
    public String toString() {
        return "Checkout Book";
    }
}
