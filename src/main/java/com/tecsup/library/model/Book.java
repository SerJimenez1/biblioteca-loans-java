package com.tecsup.library.model;

import java.util.Objects;

public class Book {
    private final String isbn;
    private String title;
    private boolean available = true;

    public Book(String isbn, String title) {
        this.isbn = Objects.requireNonNull(isbn, "isbn must not be null");
        this.title = Objects.requireNonNull(title, "title must not be null");
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setTitle(String title) {
        this.title = Objects.requireNonNull(title, "title must not be null");
    }

    public void markBorrowed() {
        this.available = false;
    }

    public void markReturned() {
        this.available = true;
    }
}
