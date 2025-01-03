package view;

import test.Car;

public class Ex02CarApp {
    public static void main(String[] args) {
        Car car1 = new Car("While", "Mazda");
        Car car2 = new Car("Red", "Toyota");
        Car car3 = new Car("Blue", "Huyndai");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
    }
}
