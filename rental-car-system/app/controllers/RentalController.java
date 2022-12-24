package controllers;

import models.Car;
import models.Rental;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.Date;
import java.util.List;

public class RentalController extends Controller {
    public Result createRental(int carId, String customerName, Date startDate, Date endDate) {
        Car car = Car.find.byId(carId);
        if (car == null) {
            return notFound("Car not found");
        }

        Rental rental = new Rental(0, customerName, car, startDate, endDate);
        rental.save();
        return ok("Rental created successfully");
    }

    public Result readRental(int rentalId) {
        Rental rental = Rental.find.byId(rentalId);
        if (rental == null) {
            return notFound("Rental not found");
        }
        return ok(rental.toString());
    }

    public Result updateRental(int rentalId, String customerName, Date startDate, Date endDate) {
        Rental rental = Rental.find.byId(rentalId);
        if (rental == null) {
            return notFound("Rental not found");
        }
        rental.setCustomerName(customerName);
        rental.setStartDate(startDate);
        rental.setEndDate(endDate);
        rental.update();
        return ok("Rental updated successfully");
    }

    public Result deleteRental(int rentalId) {
        Rental rental = Rental.find.byId(rentalId);
        if (rental == null) {
            return notFound("Rental not found");
        }
        rental.delete();
        return ok("Rental deleted successfully");
    }

    public Result listRentals() {
        List<Rental> rentals = Rental.find.all();
        return ok(rentals.toString());
    }
}
