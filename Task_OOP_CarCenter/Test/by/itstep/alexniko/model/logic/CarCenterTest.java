package by.itstep.alexniko.model.logic;

import by.itstep.alexniko.model.entity.abstracts.Car;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarCenterTest {
    @Test
    public void testCalculateTotalCarsPrice(){
        Car[] cars = {
                new Car(250000,"A4","WAUZZZ8AZMA123456"),
                new Car(52000,"A5","WAUZZZ8AZMA123456"),
                new Car(45000,"A6","WAUZZZ8AZMA123456"),
                new Car(280000,"RS6","WAUZZZ8AZMA123456"),
        };
        double expected = 627000;
        double actual = CarCenter.calculateTotalCarsPrice(cars);
        assertEquals(expected,actual,0);
    }
    @Test
    public void testCalculateTotalCarsPrice2(){
        Car[] cars = {
                new Car(0),
                new Car(0),
                new Car(0),
                new Car(0),
        };
        double expected = 0;
        double actual = CarCenter.calculateTotalCarsPrice(cars);
        assertEquals(expected,actual,0);
    }
    @Test
    public void testCalculateTotalCarsPrice3(){
        Car[] cars = {};
        double expected = 0;
        double actual = CarCenter.calculateTotalCarsPrice(cars);
        assertEquals(expected,actual,0);
    }

    @Test
    public void testCalculateMostReachCar(){
        Car[] cars = {
                new Car(250000,"A4","WAUZZZ8AZMA123413"),
                new Car(270000,"RS6","WAUZZZ8AZMA123422"),
                new Car(52000,"A5","WAUZZZ8AZMA123423"),
                new Car(45000,"A6","WAUZZZ8AZMA12355"),
                new Car(280000,"RS6","WAUZZZ8AZMA123478"),
        };
        String expected = " price=280000.0$, model='RS6, vinNumberAuto='WAUZZZ8AZMA123478";
        String actual = CarCenter.calculateMostReachCar(cars);
        assertEquals(expected,actual);
    }
    @Test
    public void testCalculateMostReachCar3(){
        Car[] cars = {};
        String expected = "Car center doesn't have cars";
        String actual = CarCenter.calculateMostReachCar(cars);
        assertEquals(expected,actual);
    }
}
