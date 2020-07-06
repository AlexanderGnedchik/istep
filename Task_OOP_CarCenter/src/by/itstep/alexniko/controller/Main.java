package by.itstep.alexniko.controller;

import by.itstep.alexniko.model.entity.AudiA;
import by.itstep.alexniko.model.entity.AudiQ;
import by.itstep.alexniko.model.entity.AudiRS;
import by.itstep.alexniko.model.entity.abstracts.Car;
import by.itstep.alexniko.model.logic.CarCenter;
import by.itstep.alexniko.model.logic.view.Printer;

public class Main {
    public static void main(String[] args) {
        Car[] car = {
                new AudiA(55000, "A4","WAUZZZ8AZMA123456", 150, 1.4),
                new AudiA(60000, "A4","WAUZZZ8AZMA123457", 150, 2.0),
                new AudiQ(90000, "Q7","WAUZZZ8AZMA123458", 208, 9.1),
                new AudiRS(180000, "RS6","WAUZZZ8AZMA123459", 3.5, 306),
                new AudiRS(280000, "RS7","WAUZZZ8AZMA123410", 3.1, 330),
                new AudiQ(85200, "Q5","WAUZZZ8AZMA123411", 208, 9.5),
                new AudiQ(90000, "Q7","WAUZZZ8AZMA123412", 215, 11.1),
                new AudiQ(93000, "Q7","WAUZZZ8AZMA123413", 223, 10.1),
        };

        String mostExpensiveCar = CarCenter.calculateMostExpensiveCar(car);
        double totalPrice = CarCenter.calculateTotalCarsPrice(car);

        Printer.printer("Most reach car: " + mostExpensiveCar);
        Printer.printer("Total price: " + totalPrice + "$");
    }

}
