package org.example.Model;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Integer employeeId;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "name")
    private String name;
    @Column(name = "position")
    @Enumerated(value = EnumType.STRING)
    private Position position;
    @ManyToOne
    @JoinColumn(name = "branch_id")
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
