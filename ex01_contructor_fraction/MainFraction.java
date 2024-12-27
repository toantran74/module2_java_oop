package ex01_contructor_fraction;

public class MainFraction {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        a.xuat();
        Fraction b = new Fraction(9, 30);
        b.xuat();
        Fraction c = new Fraction(19);
        c.xuat();
        Fraction d = new Fraction(-6, -3);
        d.xuat();
        Fraction e = new Fraction(3, -1);
        e.xuat();
        Fraction f = b.copy();
        f.xuat();
        f.cong(200);
        f.xuat();
    }
}
