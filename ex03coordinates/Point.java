package ex03coordinates;

import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coordinates of the point X: ");
        this.x = input.nextDouble();
        System.out.print("Enter the coordinates of the point Y: ");
        this.y = input.nextDouble();

    }
    double dis(Point point2){
        return Math.sqrt(Math.pow(point2.x - this.x, 2) + Math.pow(point2.y - this.y, 2));
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
