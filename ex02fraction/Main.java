package ex02fraction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap thong tin phan so 1!");
        PhanSo ps = new PhanSo();
        ps.nhap();
        ps.xuat();

        System.out.println("Nhap thong tin phan so 2!");
        PhanSo ps2 = new PhanSo();
        ps2.nhap();
        ps2.xuat();

        PhanSo tong = ps.cong(ps2);
        System.out.println("Tong 2 phan so la:");
        tong.xuat();

        PhanSo hieu = ps.tru(ps2);
        System.out.println("Hieu 2 phan so la:");
        hieu.xuat();

        PhanSo tich = ps.nhan(ps2);
        System.out.println("Tich 2 phan so la:");
        tich.xuat();

        PhanSo thuong = ps.chia(ps2);
        System.out.println("thuong 2 phan so la:");
        thuong.xuat();
        if (ps.isSoDuong()) {
            System.out.println("Phan so dau tien la so duong!");
        } else {
            System.out.println("Phan so dau tien la so am!");
        }
        if (ps2.isSoDuong()) {
            System.out.println("Phan so thu 2 la so duong!");
        } else {
            System.out.println("Phan so thu 2 la so am!");
        }
        if (ps.number0()) {
            System.out.println("Phan so dau tien la so bang 0!");
        } else {
            System.out.println("Phan so dau tien la so khong bang 0!");
        }
        if (ps2.number0()) {
            System.out.println("Phan so thu 2 la so bang 0!");
        } else {
            System.out.println("Phan so thu 2 la so khong bang 0!");
        }
    }
}
