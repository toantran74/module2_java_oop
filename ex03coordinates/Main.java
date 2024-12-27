package ex03coordinates;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point();

        System.out.println("Nhap toa do thu nhat: ");
        point1.input();
        System.out.println("Nhap toa do thu 2: ");
        point2.input();

        double result = point1.dis(point2);
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedResult = df.format(result);

        System.out.println("Ket qua la: " + formattedResult);

    }
}
