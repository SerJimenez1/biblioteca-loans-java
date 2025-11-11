package com.tecsup.library.model;

import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Loan {
    private final String id;
    private final String isbn;
    private final String memberId;
    private final LocalDate loanDate;
    private final LocalDate dueDate;
    private LocalDate returnDate;

    public Loan(String isbn, String memberId, LocalDate loanDate, LocalDate dueDate) {
        this.id = UUID.randomUUID().toString();
        this.isbn = Objects.requireNonNull(isbn, "isbn must not be null");
        this.memberId = Objects.requireNonNull(memberId, "memberId must not be null");
        this.loanDate = Objects.requireNonNull(loanDate, "loanDate must not be null");
        this.dueDate = Objects.requireNonNull(dueDate, "dueDate must not be null");
    }

    public String getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getMemberId() {
        return memberId;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public boolean isActive() {
        return returnDate == null;
    }

    public boolean isOverdue(LocalDate today) {
        return isActive() && today.isAfter(dueDate);
    }

    public void markReturned(LocalDate returnDate) {
        if (this.returnDate != null) {
            throw new IllegalStateException("Loan already returned");
        }
        this.returnDate = Objects.requireNonNull(returnDate, "returnDate must not be null");
    }
}
