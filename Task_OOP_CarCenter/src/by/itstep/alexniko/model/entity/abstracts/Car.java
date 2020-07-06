package by.itstep.alexniko.model.entity.abstracts;

public class Car {
    private double price; // $
    private String model; // line A,Q,RS,S...
    private String vinNumberAuto;

    public Car() {
    }

    public Car(double price) {
        this.price = price;
    }

    public Car(double price, String model, String vinNumberAuto) {
        this.price = price;
        this.model = model;
        this.vinNumberAuto = vinNumberAuto;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getVinNumberAuto() {
        return vinNumberAuto;
    }

    public void setVinNumberAuto(String vinNumberAuto) {
        this.vinNumberAuto = vinNumberAuto;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return " price=" + price +
                "$, model='" + model +
                ", vinNumberAuto='" + vinNumberAuto;
    }
}
