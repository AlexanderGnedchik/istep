package by.itstep.alexniko.model.entity;

import by.itstep.alexniko.model.entity.abstracts.Car;

public class AudiRS extends Car {
    double acceleration;  // sec 0 to 100 km/h
    double topSpeed; // km/h
    public AudiRS(){}

    public AudiRS(double price, String model, String vinNumberAuto, double acceleration, double topSpeed) {
        super(price, model, vinNumberAuto);
        this.acceleration = acceleration;
        this.topSpeed = topSpeed;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return  " acceleration=" + acceleration +
                "sec, topSpeed=" + topSpeed +
                "km/h, "+super.toString();
    }
}
