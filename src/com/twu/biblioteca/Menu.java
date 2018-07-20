package com.twu.biblioteca;

public class Menu {
    public enum MenuCodes {
        BookList,
        Checkout
    }


    private final Library lib;

    public Menu(Library lib) {

        this.lib = lib;
    }

    public String executeInput(MenuCodes i) {


        switch (i) {
            case BookList:
                return lib.getBookListString();
            case Checkout:
                return "Thank you! Enjoy the book";
        }
        return null;
    }

}
