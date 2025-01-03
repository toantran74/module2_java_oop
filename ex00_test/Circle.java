package ex00_test;

public class Circle extends Shape{
    public Circle(int chieuDai, int chieuRong) {
        super(chieuDai, chieuRong);
    }
    public int tinhDienTich(){
        return getChieuDai() * getChieuRong();
    }
}
