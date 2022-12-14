package org.example.Model;

public class Car {
    private Integer carId;
    private String brand;
    private String model;
    private String bodyType;
    private Integer year;
    private String colour;
    private Integer mileage;
    private Status status;
    private Integer amount;

    public Car() {
    }

    public Car(String brand, String model, String bodyType, Integer year, String colour, Integer mileage, Status status, Integer amount) {
        this.brand = brand;
        this.model = model;
        this.bodyType = bodyType;
        this.year = year;
        this.colour = colour;
        this.mileage = mileage;
        this.status = status;
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
                '}';
    }
}
