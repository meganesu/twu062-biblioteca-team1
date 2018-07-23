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
        boolean successful = lib.checkout(Integer.parseInt(userInput));
        if (successful) {
            ui.printMessage("Thank you! Enjoy the book.");
        }
        else {
            ui.printMessage("That book is not available.");
        }
        return true;
    }

    @Override
    public String toString() {
        return "Checkout Book";
    }
}
