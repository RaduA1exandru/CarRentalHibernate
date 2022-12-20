package org.example;

import org.example.Model.*;
import org.example.Repository.*;

import org.example.Util.SessionManager;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        CarRepository carRepository = new CarRepositoryImpl();
        BranchRepository branchRepository = new BranchRepositoryImpl();
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        LoanRepository loanRepository = new LoanRepositoryImpl();
        RefundRepository refundRepository = new RefundRepositoryImpl();
        ReservationRepository reservationRepository = new ReservationRepositoryImpl();



        Employee employee1 = new Employee(
                "Marcel",
                "Pavel",
                Position.EMPLOYEE
        );
        employeeRepository.create(employee1);
        System.out.println(employeeRepository.findAll());

        Refund refund1 = new Refund(
                employee1,
                new Date(Instant.now().toEpochMilli()),
                0,
                "Bad experience"
                );
        refundRepository.create(refund1);
        System.out.println(refundRepository.findAll());

        Loan loan1 = new Loan(
                employee1,
                new Date(Instant.now().toEpochMilli()), "Very Good"

        );
        loanRepository.create(loan1);
        System.out.println(loanRepository.findAll());

        Customer customer1 = new Customer(
                "Violeta",
                "Popescu",
                "violeta.popescu44@gmail.com",
                "Craiova 28-30, Cluj"
        );
        customerRepository.create(customer1);
        System.out.println(customerRepository.findAll());

        Cars car1 = new Cars(
                "BMW",
                "3Series",
                "coupe",
                2014,
                "BLACK",
                23000,
                140,
                Status.AVAILABLE
        );
        carRepository.create(car1);

        System.out.println(carRepository.findAll());
        Branch branch1 = new Branch(
                "plopilor45",
                "bucuresti"
        );
        branchRepository.create(branch1);

        Branch branch2 = new Branch(
                "lalelelor 2",
                "Pitesti"
        );
        branchRepository.create(branch2);
        System.out.println(branchRepository.findAll());

        Reservation reservation1 = new Reservation(
                new Date(Instant.now().toEpochMilli()),
                new Date(Calendar.DATE),
                new Date(Calendar.getInstance().get(5)),
                240,
                car1,
                branch1,
                branch2
        );
        reservationRepository.create(reservation1);
        System.out.println(reservationRepository.findAll());

       SessionManager.shutdown();
    }

}
