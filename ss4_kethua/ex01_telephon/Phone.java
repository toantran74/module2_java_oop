package ss4_kethua.ex01_telephon;

import java.util.Scanner;

public abstract class Phone implements Comparable<Phone> {
    private String id;
    private String namePhone;
    private double price;
    private int time;
    private String company;

    public Phone() {
    }

    public Phone(String id, String namePhone, double price, int time, String company) {
        this.id = id;
        this.namePhone = namePhone;
        this.price = price;
        this.time = time;
        this.company = company;
    }

    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ten cua dien thoai: ");
        namePhone = input.nextLine();
        System.out.print("Nhap gia ban cua dien thoai: ");
        price = Double.parseDouble(input.nextLine());
        System.out.print("Nhap thoi gian bao hanh cua dien thoai: ");
        time = Integer.parseInt(input.nextLine());
        System.out.print("Nhap hang cua dien thoai: ");
        company = input.nextLine();
    }
    public void output(){
        System.out.println("Id: " + id);
        System.out.println("Name: " + namePhone);
        System.out.println("Price: " + price);
        System.out.println("Time: " + time);
        System.out.println("Company: " + company);
    }

    @Override
    public int compareTo(Phone o) {
        return Double.compare(this.getPrice(), o.price);
    }

    public abstract double calculatePrice();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamePhone() {
        return namePhone;
    }

    public void setNamePhone(String namePhone) {
        this.namePhone = namePhone;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
