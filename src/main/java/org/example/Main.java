package org.example;

import org.example.Model.*;
import org.example.Repository.CarRepository;
import org.example.Repository.CarRepositoryImpl;
import org.example.Util.SessionManager;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        CarRepository carRepository = new CarRepositoryImpl();
        System.out.println(carRepository.findById(1));
        Car car1 = new Car(
                "BMW",
                "3 Series",
                "coupe",
                2015,
                Colour.BLACK,
                15000,
                Status.AVAILABLE,
                400,
                new Branch(1,
                        "Bvd. Muncii 19",
                        "Cluj-Napoca",
                        List<Employee>,
                        List<Car>
                        ));
        carRepository.create(car1);

        SessionManager.shutdown();
    }

}
