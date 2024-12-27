package ex01_contructor_fraction;

public class Fraction {
    private int tuso;
    private int mauso;

    public Fraction() {
        tuso = 0;
        mauso = 1;
    }

    public Fraction(int tuso) {
        this.tuso = tuso;
        mauso = 1;
    }

    public Fraction(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
        rutgon();
    }

    int uocchunglonnhat(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        a = Math.abs(a);
        for (int i = a; i >= 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    void rutgon() {
        int ucln = uocchunglonnhat2(tuso, mauso);
        tuso /= ucln;
        mauso /= ucln;

        if (mauso < 0) {
            tuso = -tuso;
            mauso = -mauso;
        }
    }

    int uocchunglonnhat2(int a, int b) {
        if (a == 0 || b == 0) {
            return 1;
        }
        a = Math.abs(a);
        for (int i = a; i >= 0; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    void xuat() {
        rutgon();
        if (mauso == 1) {
            System.out.println(tuso);
        } else {
            System.out.printf("%d / %d\n", tuso, mauso);
        }
    }

    public Fraction copy() {
        return new Fraction(tuso, mauso);
    }

    public void cong(int value) {
        tuso += value * mauso;
        rutgon();
    }
}
