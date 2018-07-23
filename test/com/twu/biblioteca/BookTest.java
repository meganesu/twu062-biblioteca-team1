package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BookTest {

    @Test
    public void bookHasATitleCatch22() {
        String title = "Catch 22";
        String author = "Joseph Heller";
        String year = "1967";

        assertEquals(title, new Book(0,title, author, year).getTitle());
    }

    @Test
    public void bookHasANoTitle() {
        String title = "No title";
        String author = "Joseph Heller";
        String year = "1967";

        assertEquals(title, new Book(0,title, author, year).getTitle());
    }

    @Test
    public void bookHasAuthor() {
        String title = "No title";
        String author = "Joseph Heller";
        String year = "1967";

        assertEquals(author, new Book(0,title, author, year).getAuthor());
    }

    @Test
    public void bookHasAYear() {
        String title = "Catch 22";
        String author = "Joseph Heller";
        String year = "1967";

        assertEquals(year, new Book(0,title, author, year).getYear());
    }

    @Test
    public void displaysTitleAuthorYear() {
        String title = "Catch 22";
        String author = "Joseph Heller";
        String year = "1967";

        String expected = "ID: 0, Title: " + title + ", Author: " + author + ", Year: " + year;

        assertEquals(expected, new Book(0,title, author, year).toString());
    }

    @Test
    public void shouldChangeIsCheckedOutToTrueWhenCheckingOutBook() {
        String title = "Catch 22";
        String author = "Joseph Heller";
        String year = "1967";

        Book b = new Book(0, title, author, year);

        assertFalse(b.isCheckedout());
        b.checkout();
        assertTrue(b.isCheckedout());

    }
}
