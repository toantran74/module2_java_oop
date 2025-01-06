package ss4_kethua.ex01_telephon;

import java.util.Scanner;

public class OldPhone extends Phone implements Discountable {
    private int pin;
    private String describe;

    public OldPhone() {
        super();
    }

    public OldPhone(String id, String namePhone, double price, int time, String company, int pin, String describe) {
        super(id, namePhone, price, time, company);
        this.pin = pin;
        this.describe = describe;
    }

    public void input() {
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap phan tram pin (%): ");
        pin = Integer.parseInt(input.nextLine());
        System.out.println("Nhap mo ta dien thoai cua ban: ");
        describe = input.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("phan tram pin (%): " + pin);
        System.out.println("phan mo ta dien thoai cua ban: " + describe);
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    @Override
    public void applyDiscount(double percentDiscount) {
        double discountedPrice = getPrice() * (1 - percentDiscount / 100.0);
        setPrice(discountedPrice);
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }
}
