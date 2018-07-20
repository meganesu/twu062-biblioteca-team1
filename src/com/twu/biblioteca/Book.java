package com.twu.biblioteca;

public class Book {

    private String author;
    private String title;
    private String year;
    private boolean isCheckedout;
    private int id;

    public Book(int id, String title, String author, String year) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.year = year;
        isCheckedout = false;
    }

    public boolean isCheckedout() {
        return isCheckedout;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Year: " + year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return book.author.equals(author) &&
                book.title.equals(title) &&
                book.year.equals(year);
    }

    public void checkout() {
        isCheckedout = true;
    }
}
