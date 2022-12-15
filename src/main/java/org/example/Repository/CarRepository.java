package org.example.Repository;

import org.example.Model.Car;

import java.util.List;
import java.util.Optional;

public interface CarRepository {
    Optional<Car> findById(int id);

    Optional<Car> findByIdAndLoadCars(int id);

    void create (Car car);

    void update (Car car);

    void delete (Car car);

    List<Car> findAll();
}
