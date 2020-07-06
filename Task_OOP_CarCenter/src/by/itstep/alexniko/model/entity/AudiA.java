package by.itstep.alexniko.model.entity;

import by.itstep.alexniko.model.entity.abstracts.Car;

public class AudiA extends Car  {
    double performance;  // horse power
    double engineCapacity; // liters

    public AudiA(){}

    public AudiA(double price, String model, String vinNumberAuto, double performance, double engineCapacity) {
        super(price, model, vinNumberAuto);
        this.performance = performance;
        this.engineCapacity = engineCapacity;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return  " enginePower=" + performance +
                "hp, engineCapacity=" + engineCapacity +
               "liters, "+ super.toString();
    }
}
