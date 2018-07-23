package com.twu.biblioteca;

public class CheckoutBookOption extends Option {

    public CheckoutBookOption(Library lib, UserInterface ui) {
        this.lib = lib;
        this.ui = ui;
    }

    @Override
    public boolean execute() {
        return true;
    }

    @Override
    public String toString() {
        return "Checkout Book";
    }
}
