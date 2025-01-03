package ex00_test;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(5);
        System.out.println( s.tinhDienTich());
        Circle c = new Circle(5, 10);
        System.out.println(c.tinhDienTich());
    }
}
