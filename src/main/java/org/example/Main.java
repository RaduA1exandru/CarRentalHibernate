package org.example;

import org.example.Model.*;
import org.example.Repository.*;

import org.example.Util.SessionManager;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Scanner;

import static com.mysql.cj.protocol.a.MysqlTextValueDecoder.getDate;
import static java.lang.System.exit;


public class Main {
    public static void main(String[] args) {

        CarRepository carRepository = new CarRepositoryImpl();
        BranchRepository branchRepository = new BranchRepositoryImpl();
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
        LoanRepository loanRepository = new LoanRepositoryImpl();
        RefundRepository refundRepository = new RefundRepositoryImpl();
        ReservationRepository reservationRepository = new ReservationRepositoryImpl();

        initRepos(carRepository,
                  branchRepository,
                  customerRepository,
                  employeeRepository,
                  loanRepository,
                  refundRepository,
                  reservationRepository);

        String[] options = {
                "1- Create Customer",
                "2- Create branch",
                "3- Create car",
                "4- Create reservation",
                "5- Exit"
        };

        Scanner scanner = new Scanner(System.in);
        printMenu(options);
        int option = 1;
        while (option != 5) {

            try {
                option = Integer.valueOf(scanner.nextLine());
                switch (option) {
                    case 1:
                        customerRepository.create(new Customer(getString("Input first name: ", scanner),
                                getString("Input last name: ", scanner),
                                getString("Input email: ", scanner),
                                getString("Input address: ", scanner)));

                        outputSuccessMsgAndDisplayMenu("Customer added", options);
                        customerRepository.create(new Customer());

                        break;
                    case 2:
                        branchRepository.create(new Branch(getString("Input address: ", scanner),
                                                            getString("Input city: ", scanner)));
                        outputSuccessMsgAndDisplayMenu("Branch added", options);
                        break;
                    case 3:
                        carRepository.create(new Cars(
                                getString("Input brand: ", scanner),
                                getString("Input model: ", scanner),
                                getString("Input: bodytype", scanner),
                                getInteger("Input year: ", scanner),
                                getString("Input colour: ", scanner),
                                getInteger("Input mileage: ", scanner),
                                getInteger("Input amount: ", scanner),
                                status("Input status", scanner)
                        ));
                        outputSuccessMsgAndDisplayMenu("Car added", options);
                        carRepository.create(new Cars());
                        break;
                    case 4:
                        reservationRepository.create(new Reservation());

                        outputSuccessMsgAndDisplayMenu("Reservation added", options);
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

    private static void outputSuccessMsgAndDisplayMenu(String message, String[] options) {
        System.out.println(message);
        printMenu(options);
    }

    private static String getString(String x, Scanner scanner) {
        System.out.println(x);
        String stringValue = scanner.nextLine();
        return stringValue;
    }
    private static Integer getInteger(String x, Scanner scanner) {
        System.out.println(x);
        Integer integerValue = Integer.valueOf(scanner.nextLine());
        return integerValue;
    }
    private static Status status(String x, Scanner scanner) {
        System.out.println(x);
        Status statusValue = Status.valueOf(scanner.nextLine());
        return statusValue;
    }
    private static Date date(Long x, Scanner scanner) {
        System.out.println(x);
        Date dateValue = Date.valueOf("yyyy-mm-dd");
        return dateValue;
    }




    public static void printMenu(String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println("Choose your option: ");
    }

    private static void initRepos(CarRepository carRepository, BranchRepository branchRepository, CustomerRepository customerRepository, EmployeeRepository employeeRepository, LoanRepository loanRepository, RefundRepository refundRepository, ReservationRepository reservationRepository) {
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

        //System.out.println(carRepository.findAll());
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


       // System.out.println(employeeRepository.findAll());

        Refund refund1 = new Refund(
                employee1,
                new Date(Instant.now().toEpochMilli()),
                0,
                "Bad experience"
        );
        refundRepository.create(refund1);
        //System.out.println(refundRepository.findAll());

        Loan loan1 = new Loan(
                employee1,
                new Date(Instant.now().toEpochMilli()), "Very Good"

        );
        loanRepository.create(loan1);
       // System.out.println(loanRepository.findAll());

        Customer customer1 = new Customer(
                "Violeta",
                "Popescu",
                "violeta.popescu44@gmail.com",
                "Craiova 28-30, Cluj"
        );
        customerRepository.create(customer1);
       // System.out.println(customerRepository.findAll());


        branchRepository.create(branch1);

        Branch branch2 = new Branch(
                "lalelelor 2",
                "Pitesti"
        );
        branchRepository.create(branch2);
       // System.out.println(branchRepository.findAll());

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
        //System.out.println(reservationRepository.findAll());

        SessionManager.shutdown();
    }
}
