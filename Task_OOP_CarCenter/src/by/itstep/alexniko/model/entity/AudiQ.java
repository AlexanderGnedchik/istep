package by.itstep.alexniko.model.entity;

import by.itstep.alexniko.model.entity.abstracts.Car;

public class AudiQ extends Car {
    double emissions; //CO₂ emissions, combined*: 208–171 g/km
    double fuelConsumption; // Fuel consumption, combined*: 9.1–6.5 l/100km
    public AudiQ (){}

    public AudiQ(double price, String model, String vinNumberAuto, double emissions, double fuelConsumption) {
        super(price, model, vinNumberAuto);
        this.emissions = emissions;
        this.fuelConsumption = fuelConsumption;
    }

    public double getEmissions() {
        return emissions;
    }

    public void setEmissions(double emissions) {
        this.emissions = emissions;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return  " emissions=" + emissions +
                "g/km, fuelConsumption=" + fuelConsumption +
                "l/100km, "+super.toString();
    }
}
