package com.twu.biblioteca;

public class CheckoutBookOption extends Option {

    public CheckoutBookOption(Library lib, UserInterface ui) {
        this.lib = lib;
        this.ui = ui;
    }

    @Override
    public boolean execute() {
        ui.printMessage("Thank you! Enjoy the book");
        return true;
    }

    @Override
    public String toString() {
        return "Checkout Book";
    }
}
