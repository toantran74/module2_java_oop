package view;

import test.Car;

public class Ex03CarApp {
    public static void main(String[] args) {
        Car c1 = new Car("#fff", "Mazda");
        Car c2 = new Car("#f00", "Mazda");
        Car c3 = new Car("#f0f", "Mazda");
        Car c4 = new Car("###", "Mazda");
        Car c100 = new Car("#000", "Mazda");
        c2.setModel("Toyota");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c100);


    }
}
