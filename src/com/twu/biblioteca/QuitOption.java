package com.twu.biblioteca;

public class QuitOption extends Option {
    public QuitOption(Library lib, UserInterface ui) {
        this.lib = lib;
        this.ui = ui;
    }

    @Override
    public boolean execute() {
        ui.printMessage("Goodbye!");
        return false;
    }

    @Override
    public String toString() {
        return "Quit";
    }
}
