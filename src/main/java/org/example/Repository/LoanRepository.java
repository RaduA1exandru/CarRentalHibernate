package org.example.Repository;
import org.example.Model.Loan;
import java.util.List;
import java.util.Optional;

public interface LoanRepository {
    Optional<Loan> findById(int id);

    void create(Loan loan);

    void update(Loan loan);

    void delete(Loan loan);

    List<Loan> findAll();
}
