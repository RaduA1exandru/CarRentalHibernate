package org.example.Model;


import javax.persistence.*;

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
    //    @Column(name = "status")
//    @Enumerated(value = EnumType.STRING)
//    private Status status;
    @Column(name = "amount")
    private Integer amount;

    public Cars() {
    }

    public Cars(String brand, String model, String bodyType, Integer year, String colour, Integer mileage, Integer amount) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.year = year;
        this.colour = colour;
        this.mileage = mileage;
        this.amount = amount;
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
                ", amount=" + amount +
                '}';
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
//    @ManyToOne
//    @JoinColumn(name = "branch_id")
//    private Branch branch;
}