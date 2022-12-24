package controllers;

import models.Car;
import play.mvc.Controller;
import play.mvc.Result;

public class CarController extends Controller {
    public Result addCar() {
       
        return ok("Car created successfully");
    }
}
