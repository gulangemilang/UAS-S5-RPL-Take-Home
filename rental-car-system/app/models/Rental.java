package models;

import java.util.Date;

public class Rental {
    private int rentalId;
    private String customerName;
    private Car car;
    private Date startDate;
    private Date endDate;

    public Rental(int rentalId, String customerName, Car car, Date startDate, Date endDate) {
        this.rentalId = rentalId;
        this.customerName = customerName;
        this.car = car;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public int getRentalId() {
        return rentalId;
    }

    public void setRentalId(int rentalId) {
        this.rentalId = rentalId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
