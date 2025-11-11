package com.tecsup.library.repo;

import com.tecsup.library.model.Loan;
import java.util.List;
import java.util.Optional;

public interface LoanRepository {
    void save(Loan loan);
    Optional<Loan> findById(String id);
    Optional<Loan> findActiveByIsbn(String isbn);
    List<Loan> findActiveByMember(String memberId);
}
