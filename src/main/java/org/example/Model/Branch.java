package org.example.Model;

public class Branch {
    public Integer branchId;
    public String address;
    public String city;
    public Employee employee;
    public Car cars;


    public Branch(Integer branchId, String address, String city, Employee employee, Car cars) {
        this.address = address;
        this.city = city;
        this.employee = employee;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Car getCars() {
        return cars;
    }

    public void setCars(Car cars) {
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
                ", employee=" + employee +
                ", cars=" + cars +
                '}';
    }
}
