package org.example.Model;

import java.sql.Date;

public class Refund {
    private Employee employee;
    private Date dateOfReturn;
    private Reservation reservation;
    private Integer surcharge;
    private String comments;

    public Refund() {
    }

    public Refund(Employee employee,
                  Date dateOfReturn,
                  Reservation reservation,
                  Integer surcharge,
                  String comments) {
        this.employee = employee;
        this.dateOfReturn = dateOfReturn;
        this.reservation = reservation;
        this.surcharge = surcharge;
        this.comments = comments;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Date getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(Date dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Integer getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(Integer surcharge) {
        this.surcharge = surcharge;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Refund{" +
                "employee=" + employee +
                ", dateOfReturn=" + dateOfReturn +
                ", reservation=" + reservation +
                ", surcharge=" + surcharge +
                ", comments='" + comments + '\'' +
                '}';
    }
}
