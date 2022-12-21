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
    public List<Cars> cars;


    public Branch() {
    }

    public Branch(String address, String city) {
        this.address = address;
        this.city = city;
    }

    public Integer getBranchId() {
        return branchId;
    }

    public void setBranchId(Integer branchId) {
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

    public List<Cars> getCars() {
        return cars;
    }

    public void setCars(List<Cars> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchId=" + branchId +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
