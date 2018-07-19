package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void bookHasATitleCatch22() {
        String title = "Catch 22";
        String author = "Joseph Heller";
        String year = "1967";

        assertEquals(title, new Book(title, author, year).getTitle());
    }

    @Test
    public void bookHasANoTitle() {
        String title = "No title";
        String author = "Joseph Heller";
        String year = "1967";

        assertEquals(title, new Book(title, author, year).getTitle());
    }

    @Test
    public void bookHasAuthor() {
        String title = "No title";
        String author = "Joseph Heller";
        String year = "1967";

        assertEquals(author, new Book(title, author, year).getAuthor());
    }

    @Test
    public void bookHasAYear() {
        String title = "Catch 22";
        String author = "Joseph Heller";
        String year = "1967";

        assertEquals(year, new Book(title, author, year).getYear());
    }

    @Test
    public void displaysTitleAuthorYear() {
        String title = "Catch 22";
        String author = "Joseph Heller";
        String year = "1967";

        String expected = "Title: " + title + ", Author: " + author + ", Year: " + year;

        assertEquals(expected, new Book(title, author, year).toString());
    }
}
