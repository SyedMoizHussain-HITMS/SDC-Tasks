package com.hitms.lms.model;

/** Represents a library book and its available inventory. */
public class Book {

    private final String title;
    private final String author;
    private int availableCopies;

    /** Creates a book record. */
    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    /** Returns the book title. */
    public String getTitle() {
        return title;
    }

    /** Returns the author's name. */
    public String getAuthor() {
        return author;
    }

    /** Returns the number of available copies. */
    public int getAvailableCopies() {
        return availableCopies;
    }

    /** Updates the number of available copies. */
    public void setAvailableCopies(int availableCopies) {
        this.availableCopies = availableCopies;
    }
}
