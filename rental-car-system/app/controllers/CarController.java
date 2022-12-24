package controllers;

import models.Car;
import play.mvc.Controller;
import play.mvc.Result;

public class CarController extends Controller {
    public Result createCar() {
        // Create a new Car object
        Car car = new Car(1, "Toyota", "Corolla", 2018, 50.0);

        // Use the setter method to change the value of the make field
        car.setMake("Honda");

        // Return a "success" message
        return ok("Car created successfully");
    }
}
