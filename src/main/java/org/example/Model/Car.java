package org.example.Model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "car")
public class Car {
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
    @Enumerated(value = EnumType.STRING)
    private Colour colour;
    @Column(name = "mileage")
    private Integer mileage;
    @Column(name = "status")
    @Enumerated(value = EnumType.STRING)
    private Status status;
    @Column(name = "amount")
    private Integer amount;
    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    public Car() {}

    public Car(String brand,
               String model,
               String bodyType,
               Integer year,
               Colour colour,
               Integer mileage,
               Status status,
               Integer amount,
               Branch branch) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.year = year;
        this.colour = colour;
        this.mileage = mileage;
        this.status = status;
        this.amount = amount;
        this.branch = branch;
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

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getAmount() {
        return amount;
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

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                ", mileage=" + mileage +
                ", status=" + status +
                ", amount=" + amount +
                ", branch=" + branch +
                '}';
    }
}
