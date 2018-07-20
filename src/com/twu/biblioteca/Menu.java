package com.twu.biblioteca;

import java.io.IOException;

public class Menu {


    public enum MenuCode {
        BookList,
        Checkout,
        Invalid
    }


    private final Library lib;
    private final UserInterface ui;

    public Menu(Library lib, UserInterface ui) {

        this.lib = lib;
        this.ui = ui;
    }

    public MenuCode parseIntToMenuCode (int i) {
        switch (i) {
            case 1:
                return MenuCode.BookList;
            case 2:
                return MenuCode.Checkout;

        }
        return MenuCode.Invalid;
    }

    public String executeInput(MenuCode i) {


        switch (i) {
            case BookList:
                return lib.getBookListString();
            case Checkout:
                return "Thank you! Enjoy the book";
        }
        return null;
    }

    public void doRequest() throws IOException {
        String userInput = ui.getUserInput();

        // TODO: assume for now the userInput is fine

        MenuCode menuCode = parseIntToMenuCode(Integer.parseInt(userInput));
        String response = executeInput(menuCode);

        ui.printMessage(response);
    }

}
