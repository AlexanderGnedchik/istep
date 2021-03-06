package by.itstep.alexniko.model.logic;

import by.itstep.alexniko.model.entity.abstracts.Car;

public class CarCenter {
    public static double calculateTotalCarsPrice(Car[] cars) {

        double totalPrice = 0;

        for (Car car : cars) {
            if (car.getPrice() < 0) { // protect
                totalPrice = -1;
                break;
            } else {
                totalPrice += car.getPrice();
            }
        }
        return totalPrice;
    }

    public static String calculateMostExpensiveCar(Car[] cars) {
        String model = "Car center doesn't have cars";
        double maxPrice = 0;
        for (Car car : cars) {
            if (car.getPrice() < 0) {  // protect
                return "Error";
            } else {
                if (car.getPrice() > maxPrice) {
                    maxPrice = car.getPrice();
                    model = car.getModel() + ", VIN Number Auto: " + car.getVinNumberAuto();
                }
            }
        }
        return model;
    }
}
