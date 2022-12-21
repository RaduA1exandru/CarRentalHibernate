package org.example.Model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Cars")
public class Cars {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Integer carId;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "body_type")
    private String bodyType;
    @Column(name = "year")
    private Integer year;
    @Column(name = "colour")
    private String colour;
    @Column(name = "mileage")
    private Integer mileage;

    @Column(name = "amount")
    private Integer amount;
    @Column
    @Enumerated(value = EnumType.STRING)
    private Status status;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @OneToMany(mappedBy = "cars")
    private List<Reservation> reservation;

    public Cars() {
    }

    public Cars(String brand, String model, String bodyType, Integer year, String colour, Integer mileage, Integer amount, Status status) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.year = year;
        this.colour = colour;
        this.mileage = mileage;
        this.amount = amount;
        this.status = status;
    }

    public Integer getCarId() {
        return carId;
    }

    public void setCarId(Integer carId) {
        this.carId = carId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Integer getAmount() {
        return amount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", mileage=" + mileage +
                ", amount=" + amount +
                ", status=" + status +
                ",branch_id" + branch +
                '}';
    }

}