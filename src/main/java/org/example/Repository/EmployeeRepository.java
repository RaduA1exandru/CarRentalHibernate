package org.example.Repository;

import org.example.Model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository {
    Optional<Employee> findById(int id);

    void create(Employee employee);

    void  update(Employee employee);

    void  delete(Employee employee);

    List<Employee> findAll();
}
