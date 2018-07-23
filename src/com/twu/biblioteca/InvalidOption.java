package com.twu.biblioteca;

public class InvalidOption extends Option {

    InvalidOption(Library lib, UserInterface ui) {
        this.lib = lib;
        this.ui = ui;
    }


    @Override
    public boolean execute() {
        ui.printMessage("Select a valid option!");
        return true;
    }
}
