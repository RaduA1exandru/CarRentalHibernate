package org.example.Repository;

import org.example.Model.Cars;

import java.util.List;
import java.util.Optional;

public interface CarRepository {
    Optional<Cars> findById(int id);

    Optional<Cars> findByIdAndLoadCars(int id);

    void create (Cars car);

    void update (Cars car);

    void delete (Cars car);

    List<Cars> findAll();
}
