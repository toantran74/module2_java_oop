package ss4_kethua.ex01_telephon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    static ArrayList<OldPhone> oldPhones = new ArrayList<>();
    static ArrayList<NewPhone> newPhones = new ArrayList<>();

    static {
        // add phone old
        oldPhones.add(new OldPhone("DTC001", "Iphon 14", 200000, 7, "Apple", 98, "Ngon"));
        oldPhones.add(new OldPhone("DTC002", "Iphon 14", 200000, 7, "Apple", 98, "Ngon"));

        // add phone new
        newPhones.add(new NewPhone("DTM001", "Iphon 17", 900000, 8, "Apple", 12));
        newPhones.add(new NewPhone("DTM002", "Iphon 17", 900000, 8, "Apple", 12));
    }

    public static void main(String[] args) {
        int choice;
        while (true) {
            do {
                System.out.println("CHUONG TRINH QUAN LY DIEN THOAI!");
                System.out.println("1. Xem danh sach dien thoai");
                System.out.println("2. Them moi");
                System.out.println("3. Cap nhat");
                System.out.println("4. Xoa");
                System.out.println("5. Sap xep theo gia");
                System.out.println("6. Tim kiem");
                System.out.println("7. Tinh tong tien");
                System.out.println("8. Giam gia cho dien thoai cu");
                System.out.println("9. Thoat");

                System.out.println("Moi ban lua chọn");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        menu1();
                        break;
                    case 2:
                        menu2();
                        break;
                    case 3:
                        menu3();
                        break;
                    case 4:
                        menu4();
                        break;
                    case 5:
                        menu5();
                        break;
                    case 6:
                        menu6();
                        break;
                    case 7:
                        menu7();
                        break;
                    case 8:
                        menu8();
                        break;
                    case 9:
                        return;
                }
            } while (choice < 1 || choice > 5);
        }
    }

    private static void menu1() {
        int choice;
        while (true) {
            do {
                System.out.println("DANH SACH DIEN THOAI");
                System.out.println("1. Xem tat ca");
                System.out.println("2. Xem dien thoai cu");
                System.out.println("3. Xem dien thoai moi");
                System.out.println("4. Tro ve menu chinh");
                System.out.println("Moi ban lua chọn");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Danh sach tat ca cac dien thoai");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai thu: " + (i + 1));
                            oldPhones.get(i).output();
                        }

                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai thu: " + (i + 1));
                            newPhones.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("Danh sach cac dien thoai cu");
                        for (int i = 0; i < oldPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai thu: " + (i + 1));
                            oldPhones.get(i).output();
                        }
                        break;
                    case 3:
                        System.out.println("Danh sach cac dien thoai moi");
                        for (int i = 0; i < newPhones.size(); i++) {
                            System.out.println("Thong tin dien thoai thu: " + (i + 1));
                            newPhones.get(i).output();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le!");
                }
            } while (choice < 1 || choice > 4);
        }
    }

    private static void menu2() {
        int choice;
        while (true) {
            do {
                System.out.println("THEM MOI DIEN THOAI");
                System.out.println("1. Them moi dien thoai cu");
                System.out.println("2. Them moi dien thoai moi");
                System.out.println("3. Thoat");

                System.out.println("Moi ban lua chon");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        OldPhone oldPhone = new OldPhone();
                        oldPhone.output();
                        oldPhone.setId(getIdOldPhone());
                        oldPhones.add(oldPhone);
                        System.out.println("Them moi thanh cong");
                        break;
                    case 2:
                        NewPhone newPhone = new NewPhone();
                        newPhone.output();
                        newPhone.setId(newPhone.getId());
                        newPhones.add(newPhone);
                        System.out.println("Them moi thanh cong");
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le!");
                }

            }while (choice < 1 || choice > 3);

        }
    }
    private static String getIdOldPhone() {
        if(oldPhones.size() == 0){
            return "DTC001";
        }
        int max = Integer.parseInt(oldPhones.get(0).getId().substring(3));
        for (int i = 1; i < oldPhones.size(); i++) {
            int id = Integer.parseInt(oldPhones.get(i).getId().substring(3));
            if (id > max){
                max = id;
            }
        }
        return String.format("DTC%03d", max + 1).replace(" ", "0");
    }

    private static String getIdNewPhone() {
        if(oldPhones.size() == 0){
            return "DTM001";
        }
        int max = Integer.parseInt(oldPhones.get(0).getId().substring(3));
        for (int i = 1; i < newPhones.size(); i++) {
            int id = Integer.parseInt(oldPhones.get(i).getId().substring(3));
            if (id > max){
                max = id;
            }
        }
        return String.format("DTM%03d", max + 1).replace(" ", "0");
    }

}
