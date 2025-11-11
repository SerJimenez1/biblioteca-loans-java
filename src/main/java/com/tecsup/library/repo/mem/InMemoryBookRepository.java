package com.tecsup.library.repo.mem;

import com.tecsup.library.model.Book;
import com.tecsup.library.repo.BookRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryBookRepository implements BookRepository {
    private final Map<String, Book> data = new HashMap<>();

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        return Optional.ofNullable(data.get(isbn));
    }

    @Override
    public void save(Book book) {
        data.put(book.getIsbn(), book);
    }
}
