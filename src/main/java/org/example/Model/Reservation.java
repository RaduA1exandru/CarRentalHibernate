package org.example.Model;


import javax.persistence.*;
import java.sql.Date;
@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Integer reservationId;
    @Column(name = "date_of_booking")
    private Date dateOfBooking;
    @Column(name = "date_from")
    private Date dateFrom;
    @Column(name = "date_to")
    private Date dateTo;
    @Column(name = "amount")
    private Integer amount;
    @OneToOne
    @JoinColumn(name = "car")
    private Cars car;
    @OneToOne
    @JoinColumn(name = "branch")
    private Branch branch;
    @OneToOne
    @JoinColumn(name = "return_branch")
    private Branch returnBranch;

    public Reservation() {
    }

    public Reservation(Date dateOfBooking, Date dateFrom, Date dateTo, Integer amount, Cars car, Branch branch, Branch returnBranch) {
        this.dateOfBooking = dateOfBooking;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.amount = amount;
        this.car = car;
        this.branch = branch;
        this.returnBranch = returnBranch;
    }

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public Date getDateOfBooking() {
        return dateOfBooking;
    }

    public void setDateOfBooking(Date dateOfBooking) {
        this.dateOfBooking = dateOfBooking;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Cars getCar() {
        return car;
    }

    public void setCar(Cars car) {
        this.car = car;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Branch getReturnBranch() {
        return returnBranch;
    }

    public void setReturnBranch(Branch returnBranch) {
        this.returnBranch = returnBranch;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", dateOfBooking=" + dateOfBooking +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", amount=" + amount +
                ", car=" + car +
                ", branch=" + branch +
                ", returnBranch=" + returnBranch +
                '}';
    }
}
