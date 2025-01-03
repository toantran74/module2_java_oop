package ex02_MathUtil;

public class Main {
    public static void main(String[] args) {

        double a = 12;
        double b = 28;
        double sum = MathUtil.add(a, b);
        double difference = MathUtil.sub(a, b);
        double division = MathUtil.div(a, b);
        double quotient = MathUtil.mul(a, b);
        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + difference);
        System.out.println("a * b = " + division);
        System.out.println("a / b = " + quotient);

    }
}
