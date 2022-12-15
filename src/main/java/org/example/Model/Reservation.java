package org.example.Model;


import java.sql.Date;

public class Reservation {
    private Integer reservationId;
    private Date dateOfBooking;
    private Date dateFrom;
    private Date dateTo;
    private Integer amount;
    private Car car;
    private Branch branch;
    private Branch returnBranch;
}
