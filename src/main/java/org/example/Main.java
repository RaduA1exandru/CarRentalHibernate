package org.example;

import org.example.Model.*;
import org.example.Repository.*;

import org.example.Util.SessionManager;

import java.sql.Date;
import java.time.Instant;
import java.util.Calendar;
import java.util.Scanner;

import static java.lang.System.exit;


public class Main {
    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("Choose your option: ");
    }

    public static void main(String[] args) {

        CarRepository carRepository = new CarRepositoryImpl();
        BranchRepository branchRepository = new BranchRepositoryImpl();
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        LoanRepository loanRepository = new LoanRepositoryImpl();
        RefundRepository refundRepository = new RefundRepositoryImpl();
        ReservationRepository reservationRepository = new ReservationRepositoryImpl();

        Branch mainBranch = new Branch("Burebista 69", "Cluj-Napoca");

        branchRepository.create(mainBranch);

        Employee employee1 = new Employee(
                "Marcel",
                "Pavel",
                Position.EMPLOYEE
        );

        Employee employee2 = new Employee(
                "Mirela",
                "Augstin",
                Position.EMPLOYEE
        );
        employeeRepository.create(employee2);

        System.out.println(carRepository.findAll());
        Branch branch1 = new Branch(
                "Aurel Vlaicu 3",
                "Bucuresti"
        );


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

        Cars car2 = new Cars(
                "BMW",
                "5Series",
                "Sedan",
                2020,
                "White",
                10000,
                200,
                Status.AVAILABLE
        );
        carRepository.create(car2);

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


        String[] options = {
                "1- Create Customer",
                "2- Create branch",
                "3- Create car",
                "4- Create reservation",
                "5- Exit"
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option != 5) {
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        customerRepository.create(new Customer(
                                "Violeta",
                                "Popescu",
                                "violeta.popescu44@gmail.com",
                                "Craiova 28-30, Cluj"));
                        break;
                    case 2:
                        // get input params from console address = inputConsola
                        // city = inputConsola
                        // new Branch(address, city)

                        branchRepository.create(new Branch());
                        break;
                    case 3:
                        carRepository.create(new Cars());
                        break;
                    case 4:
                        reservationRepository.create(new Reservation());
                        break;
                    case 5:
                        exit(0);
                }
            } catch (Exception e) {
                scanner.next();
            }
        }
    }

}
