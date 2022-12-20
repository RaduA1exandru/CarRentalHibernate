package org.example.Repository;
import org.example.Model.Refund;
import java.util.List;
import java.util.Optional;

public interface RefundRepository {
    Optional<Refund> findById(int id);

    void create(Refund refund);

    void update(Refund refund);

    void delete(Refund refund);

    List<Refund> findAll();
}
