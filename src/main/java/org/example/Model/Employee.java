package org.example.Model;

public class Employee {
    private Integer employeeId;
    private String firstName;
    private String name;
    private Position position;

    public Employee() {
    }

    public Employee(String firstName, String name, Position position) {
        this.firstName = firstName;
        this.name = name;
        this.position = position;
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

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
