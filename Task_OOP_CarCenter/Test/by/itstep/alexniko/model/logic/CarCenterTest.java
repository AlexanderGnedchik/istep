package by.itstep.alexniko.model.logic;

import by.itstep.alexniko.model.entity.abstracts.Car;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CarCenterTest {

    private Car [] cars;

    @Before
    public  void init() {
        cars = new Car[]{
                new Car(250000,"A4","WAUZZZ8AZMA123456"),
                new Car(52000,"A5","WAUZZZ8AZMA123456"),
                new Car(45000,"A6","WAUZZZ8AZMA123456"),
                new Car(280000,"RS6","WAUZZZ8AZMA123456"),
        };
    }
    @After
    public void clean(){
        cars = null;
    }

    @Test
    public void testCalculateTotalCarsPrice(){
        double expected = 627000;
        double actual = CarCenter.calculateTotalCarsPrice(cars);
        assertEquals(expected,actual,0);
    }
    @Test
    public void testCalculateMostReachCar(){
        String expected = " price=280000.0$, model='RS6, vinNumberAuto='WAUZZZ8AZMA123456";
        String actual = CarCenter.calculateMostExpensiveCar(cars);
        assertEquals(expected,actual);
    }
    @Test
    public void testCalculateTotalCarsPrice2(){
        cars = new Car[] {
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
        cars = new Car[] {};
        double expected = 0;
        double actual = CarCenter.calculateTotalCarsPrice(cars);
        assertEquals(expected,actual,0);
    }

    @Test
    public void testCalculateMostReachCar2(){
        cars = new Car[] {};
        String expected = "Car center doesn't have cars";
        String actual = CarCenter.calculateMostExpensiveCar(cars);
        assertEquals(expected,actual);
    }
}
