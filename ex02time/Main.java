package ex02time;

public class Main {
    public static void main(String[] args) {
        Time a = new Time();
        a.xuat();
        System.out.println();
        Time b = new Time(9);
        b.xuat();
        System.out.println();
        Time c = new Time(24, 50);
        c.xuat();
        System.out.println();
        Time f = new Time(c);
        f.xuat();
    }
}
