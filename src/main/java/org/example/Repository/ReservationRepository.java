package org.example.Repository;

import org.example.Model.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationRepository {
    Optional<Reservation> findById(int id);

    void create(Reservation reservation);

    void update(Reservation reservation);

    void delete(Reservation reservation);

    List<Reservation> findAll();
}

