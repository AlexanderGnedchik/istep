package by.itstep.alexniko.model.logic;

import by.itstep.alexniko.model.entity.abstracts.Car;

public class CarCenter {
    public static double calculateTotalCarsPrice(Car[] cars) {

        double totalPrice = 0;

        for (Car car : cars) {
            totalPrice += car.getPrice();
        }
        return totalPrice;
    }

    public static String calculateMostReachCar(Car[] cars) {
        String model = "Car center doesn't have cars";
        double maxPrice = 0;
        for (Car car : cars) {
            if (car.getPrice() > maxPrice) {
                maxPrice = car.getPrice();
                model = car.toString();
            }
        }
        return model;
    }
}
