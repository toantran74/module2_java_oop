package test;

import java.util.Objects;

public class Car {
    private String color;
    private static String model;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(color);
    }

    // constructor
    public Car() {
    }

    public Car(String color, String model) {
        this.color = color;
        //Car.model = model;
    }
    //getter and setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        Car.model = model;
    }

    @Override
    public String toString() {
        return this.color + " " + model;
    }
}
