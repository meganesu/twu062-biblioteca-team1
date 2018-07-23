package com.twu.biblioteca;

public class ReturnBookOption extends Option {

    public ReturnBookOption(Library lib, UserInterface ui) {
        this.lib = lib;
        this.ui = ui;
    }

    @Override
    public boolean execute() {
        return true;
    }

    @Override
    public String toString() {
        return "Return Book";
    }
}
