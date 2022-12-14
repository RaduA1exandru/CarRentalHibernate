package org.example.Model;

public class Employee {
    private Integer employeeId;
    private String firstName;
    private String name;
    private Position position;
    private Branch branch;

    public Employee() {
    }

    public Employee(String firstName, String name, Position position, Branch branch) {
        this.firstName = firstName;
        this.name = name;
        this.position = position;
        this.branch = branch;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", position=" + position +
                ", branch=" + branch +
                '}';
    }
}
