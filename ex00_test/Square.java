package ex00_test;

import java.awt.*;

public class Square extends Shape{
    public Square(int chieuDai) {
        super(chieuDai, chieuDai);
    }
    public int tinhDienTich(){
        return getChieuDai() * getChieuRong();
    }
}
