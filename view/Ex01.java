package view;

import test.Rectangle;

public class Ex01 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
//        r1.width = 10;
//        r1.height = 20;
        r1.setWidth(20);
        r1.setHeight(200);

        Rectangle r2 = new Rectangle();
//        r2.width = 20;
//        r2.height = 20;
        r2.setWidth(27);
        r2.setHeight(290);
        System.out.println(r1);
        System.out.println(r2);
    }
}
