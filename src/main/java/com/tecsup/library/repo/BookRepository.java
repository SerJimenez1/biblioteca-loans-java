package com.tecsup.library.repo;

import com.tecsup.library.model.Book;
import java.util.Optional;

public interface BookRepository {
    Optional<Book> findByIsbn(String isbn);
    void save(Book book);
}
