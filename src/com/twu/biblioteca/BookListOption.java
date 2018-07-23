package com.twu.biblioteca;

public class BookListOption extends Option {

    private Library lib;
    private UserInterface ui;

    public BookListOption(Library lib, UserInterface ui) {
        this.lib = lib;
        this.ui = ui;
    }

    @Override
    public boolean execute() { //May need more clarification on purpose of this method.
        BookListOption option = new BookListOption(lib, ui);
        option.lib.getBookList();

        return true;
    }
}
