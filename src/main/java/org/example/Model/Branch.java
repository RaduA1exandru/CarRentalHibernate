package org.example.Model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "branch")
public class Branch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "branch_id")
    public Integer branchId;
    @Column(name = "address")
    public String address;
    @Column(name = "city")
    public String city;
    @OneToMany(mappedBy = "branch")
    public List<Employee> employees;
    @OneToMany(mappedBy = "branch")
    public List<Car> cars;


    public Branch(Integer branchId,
                  String address,
                  String city,
                  List<Employee> employees,
                  List<Car> cars) {
        this.address = address;
        this.city = city;
        this.employees = employees;
        this.cars = cars;
        this.branchId = branchId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
        this.branchId = branchId;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", employee=" + employees +
                ", cars=" + cars +
                '}';
    }
}
