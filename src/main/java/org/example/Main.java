package org.example;

import org.example.Model.*;
import org.example.Repository.*;

import org.example.Util.SessionManager;


public class Main {
    public static void main(String[] args) {

        CarRepository carRepository = new CarRepositoryImpl();
        BranchRepository branchRepository = new BranchRepositoryImpl();
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

        Employee employee1 = new Employee(
                "Marcel",
                "Pavel"
        );
        employeeRepository.create(employee1);
        System.out.println(employeeRepository.findAll());

//        Customer customer1 = new Customer(
//                "Violeta",
//                "Popescu",
//                "violeta.popescu44@gmail.com",
//                "Craiova 28-30, Cluj"
//        );
//        customerRepository.create(customer1);
//        System.out.println(customerRepository.findAll());

//        Cars car1 = new Cars(
//                "BMW",
//                "3Series",
//                "coupe",
//                2014,
//                "BLACK",
//                23000,
//                140
//        );
//        carRepository.create(car1);
//
//        System.out.println(carRepository.findAll());
//        Branch branch1 = new Branch(
//                "plopilor45",
//                "bucuresti"
//        );
//        branchRepository.create(branch1);
//        System.out.println(branchRepository.findById(1));



       SessionManager.shutdown();
    }

}
