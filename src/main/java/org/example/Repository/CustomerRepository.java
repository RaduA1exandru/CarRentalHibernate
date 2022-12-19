package org.example.Repository;

import org.example.Model.Customer;


import java.util.List;
import java.util.Optional;

public interface CustomerRepository {
    Optional<Customer>findById(int id);
    void create(Customer customer);

    void  update(Customer customer);

    void  delete(Customer customer);

    List<Customer> findAll();
}
