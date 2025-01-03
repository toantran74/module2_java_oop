package ss4_kethua.ex01_telephon;

import java.util.Scanner;

public class NewPhone extends Phone {
    private int quantity;

    public NewPhone() {
        super();
    }

    public NewPhone(int id, String namePhone, double price, int time, String company, int quantity) {
        super(id, namePhone, price, time, company);
        this.quantity = quantity;
    }

    public void input(){
        super.input();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        quantity = Integer.parseInt(input.nextLine());
    }
    public void output(){
        super.output();
        System.out.println("Quantity: " + quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
