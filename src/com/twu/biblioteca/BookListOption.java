package com.twu.biblioteca;

import java.util.ArrayList;

public class BookListOption extends Option {

    BookListOption(Library lib, UserInterface ui) {
        this.lib = lib;
        this.ui = ui;
    }

    @Override
    public boolean execute() {
        //May need more clarification on purpose of this method
        ArrayList<Book> bookList = lib.getBookList();
        ui.printBookListString(bookList);


        return true;
    }

    @Override
    public String toString() {
        return "List Books";
    }
}
