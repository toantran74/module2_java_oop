package ex01_contructor_fraction;

public class App {
    public static void main(String[] args) {
        System.out.println(isSum(1, 2));
        System.out.println(isSum(2, 3, 5));
    }

    public static int isSum(int a, int b) {
        return a + b;
    }

    public static double isSum(double a, double b, double c) {
        return a + b + c;
    }
}
