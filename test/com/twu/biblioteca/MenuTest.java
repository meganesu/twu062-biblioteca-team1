package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    @Test
    public void shouldGetBookListWhenGivenInput1() {

        Library lib = new Library(LibraryTest.testBookList);
        Menu menu = new Menu(lib);

        assertEquals(lib.getBookListString(), menu.executeInput(Menu.MenuCodes.BookList));

    }
    @Test
    public void shouldShowIfOptionIsInvalid()
    {

    }

    @Test
    public void shouldReturnIfBookWasCheckedOutSuccessfully()
    {
        Library lib = new Library(LibraryTest.testBookList);
        Menu menu = new Menu(lib);
        assertEquals("Thank you! Enjoy the book", menu.executeInput(Menu.MenuCodes.Checkout));
    }
}
