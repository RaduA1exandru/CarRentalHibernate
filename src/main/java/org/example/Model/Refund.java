package org.example.Model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name= "Refund")
public class Refund {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "refund_id")
    private Integer refundId;
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    @Column(name = "date_of_return")
    private Date dateOfReturn;

    //    private Reservation reservation;
    @Column(name = "surcharge")
    private Integer surcharge;
    @Column(name = "comments")
    private String comments;

    public Refund() {
    }

    public Refund(Employee employee, Date dateOfReturn, Integer surcharge, String comments) {
        this.employee = employee;
        this.dateOfReturn = dateOfReturn;
        this.surcharge = surcharge;
        this.comments = comments;
    }

    public Integer getRefundId() {
        return refundId;
    }

    public void setRefundId(Integer refundId) {
        this.refundId = refundId;
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
                "refundId=" + refundId +
                ", employee=" + employee +
                ", dateOfReturn=" + dateOfReturn +
                ", surcharge=" + surcharge +
                ", comments='" + comments + '\'' +
                '}';
    }
}
