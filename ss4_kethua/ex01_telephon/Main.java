package ss4_kethua.ex01_telephon;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Phone> phones = new ArrayList<>();
    //static ArrayList<OldPhone> oldPhones = new ArrayList<>();
    //static ArrayList<NewPhone> newPhones = new ArrayList<>();

    static {
        // add phone old
        phones.add(new OldPhone("DTC001", "Iphon 14", 200000, 7, "Apple", 98, "Ngon"));
        phones.add(new OldPhone("DTC002", "Iphon 14", 200000, 7, "Apple", 98, "Ngon"));

        // add phone new
        phones.add(new NewPhone("DTM001", "Iphon 17", 900000, 8, "Apple", 12));
        phones.add(new NewPhone("DTM002", "Iphon 17", 900000, 8, "Apple", 12));
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
                        //menu7();
                        break;
                    case 8:
                        //menu8();
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
                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Thong tin dien thoai thu: " + (i + 1));
                            phones.get(i).output();
                        }

                        for (int i = 0; i < phones.size(); i++) {
                            System.out.println("Thong tin dien thoai thu: " + (i + 1));
                            phones.get(i).output();
                        }
                        break;
                    case 2:
                        System.out.println("Danh sach cac dien thoai cu");
                        int count = 1;
                        for (Phone phone : phones) {
                            if (phone instanceof NewPhone) {
                                System.out.println("Thong tin dien thoai thu: " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Danh sach cac dien thoai moi");
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone instanceof OldPhone) {
                                System.out.println("Thong tin dien thoai thu: " + count++);
                                phone.output();
                            }
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
                        phones.add(oldPhone);
                        System.out.println("Them moi thanh cong");
                        break;
                    case 2:
                        NewPhone newPhone = new NewPhone();
                        newPhone.output();
                        newPhone.setId(getIdNewPhone());
                        phones.add(newPhone);
                        System.out.println("Them moi thanh cong");
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lua chon khong hop le!");
                }

            } while (choice < 1 || choice > 3);

        }
    }

    private static String getIdOldPhone() {
        ArrayList<OldPhone> oldPhones = getOldPhones();
        if (oldPhones.size() == 0) {
            return "DTC001";
        }
        int max = Integer.parseInt(oldPhones.get(0).getId().substring(3));
        for (int i = 1; i < oldPhones.size(); i++) {
            int id = Integer.parseInt(oldPhones.get(i).getId().substring(3));
            if (id > max) {
                max = id;
            }
        }
        return String.format("DTC%03d", max + 1).replace(" ", "0");
    }

    private static ArrayList<OldPhone> getOldPhones() {
        ArrayList<OldPhone> oldPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof OldPhone) {
                oldPhones.add((OldPhone) phone);
            }
        }
        return oldPhones;
    }

    private static String getIdNewPhone() {
        ArrayList<NewPhone> newPhones = getNewPhone();
        if (phones.size() == 0) {
            return "DTM001";
        }
        int max = Integer.parseInt(phones.get(0).getId().substring(3));
        for (int i = 1; i < phones.size(); i++) {
            int id = Integer.parseInt(phones.get(i).getId().substring(3));
            if (id > max) {
                max = id;
            }
        }
        return String.format("DTM%03d", max + 1).replace(" ", "0");
    }

    private static ArrayList<NewPhone> getNewPhone() {
        ArrayList<NewPhone> newPhones = new ArrayList<>();
        for (Phone phone : phones) {
            if (phone instanceof NewPhone) {
                newPhones.add((NewPhone) phone);
            }
        }
        return newPhones;
    }

    private static void menu3() {
        System.out.println("Nhap vao ma ban muon cap nhat!");
        String id = input.nextLine();

        if (id.startsWith("DTC") || id.startsWith("DTM")) {
            boolean testPhone = false;
            for (Phone phone : phones) {
                if (phone.getId().equals(id)) {
                    testPhone = true;
                    phone.input();
                    System.out.println("Cap nhap thanh cong");
                    break;
                }
            }
            if (!testPhone) {
                System.out.println("Khong tim thay ma muon cap nhat!");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }

    private static void menu4() {
        System.out.println("Nhap vao ma ban muon xoa");
        String id = input.nextLine();
        if (id.startsWith("DTC") || id.startsWith("DTM")) {
            boolean testPhone = false;
            for (Phone phone : phones) {
                if (phone.getId().equals(id)) {
                    testPhone = true;
                    System.out.println("Ban co muon xoa dien thoai nay khong?(yes/no)");
                    String choice = input.nextLine();
                    if (choice.equalsIgnoreCase("yes")) {
                        phones.remove(phone);
                    } else {
                        System.out.println("Da huy viec xoa!");
                    }
                    break;
                }
            }
            if (!testPhone) {
                System.out.println("Khong tim thay ma muon xoa!");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }

    private static void menu5() {
        int choice;
        while (true) {
            do {
                System.out.println("Sap xep dien thoai theo gia");
                System.out.println("1. Tang dan");
                System.out.println("2. Giam dan");
                System.out.println("3. Thoat");

                System.out.println("Moi ban lua chon");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Tang dan");
                        for (int i = 0; i < phones.size() - 1; i++) {
                            for (int j = i + 1; j < phones.size(); j++) {
                                if (phones.get(i).getPrice() > phones.get(j).getPrice()) {
                                    Phone temp = phones.get(i);
                                    phones.set(i, phones.get(j));
                                    phones.set(j, temp);
                                }
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Giam dan");
                        for (int i = 0; i < phones.size() - 1; i++) {
                            for (int j = i + 1; j < phones.size(); j++) {
                                if (phones.get(i).getPrice() < phones.get(j).getPrice()) {
                                    Phone temp = phones.get(i);
                                    phones.set(i, phones.get(j));
                                    phones.set(j, temp);
                                }
                            }
                        }
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Invalid Input");
                }
            } while (choice < 0 || choice > 3);
        }
    }

    private static void menu6() {
        int choice;
        while (true) {
            do {
                System.out.println("TIM KIEM DIEN THOAI");
                System.out.println("1. Tim kiem tat ca cac dien thoai");
                System.out.println("2. Tim kiem dien thoai cu");
                System.out.println("3. Tim kiem dien thoai moi");
                System.out.println("Thoat");
                System.out.println("Moi ban lua chon");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        searchAllPhone();
                        break;
                    case 2:
                        searchOldPhone();
                        break;
                    case 3:
                        searchNewPhone();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid Input");
                }
            } while (choice < 0 || choice > 4);
        }
    }

    private static void searchAllPhone() {
        int choice;
        while (true) {
            do {
                System.out.println("Tim kiem theo tat ca cac dien thoai");
                System.out.println("1. Tim kiem theo gia");
                System.out.println("2. Tim kiem theo ten");
                System.out.println("3. Tim kiem theo hang");
                System.out.println("4. Thoat");
                System.out.println("Moi ban lua chon");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("THEO GIA");
                        System.out.println("Nhap vao  khoang gia ban muon tim: ");
                        System.out.println("Gia nho nhat: ");
                        int minPrice = Integer.parseInt(input.nextLine());
                        System.out.println("Gia lon nhat: ");
                        int maxPrice = Integer.parseInt(input.nextLine());

                        int count = 1;
                        for (Phone phone : phones) {
                            if (phone.getPrice() <= maxPrice && phone.getPrice() >= minPrice) {
                                System.out.println("thong tin dien thoai thu: " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("THEO TEN");
                        System.out.println("Nhap vao ten can tim: ");
                        String name = input.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getNamePhone().equals(name)) {
                                System.out.println("thong tin dien thoai thu: " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("THEO HANG");
                        System.out.println("Nhap vao hang can tim: ");
                        String company = input.nextLine();
                        count = 1;
                        for (Phone phone : phones) {
                            if (phone.getCompany().equals(company)) {
                                System.out.println("thong tin dien thoai thu: " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid Input");
                }
            } while (choice < 0 || choice > 4);
        }
    }

    private static void searchOldPhone() {
        int choice;
        while (true) {
            do {
                System.out.println("Tim kiem theo tat ca cac dien thoai");
                System.out.println("1. Tim kiem theo gia");
                System.out.println("2. Tim kiem theo ten");
                System.out.println("3. Tim kiem theo hang");
                System.out.println("4. Thoat");
                System.out.println("Moi ban lua chon");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("THEO GIA");
                        break;
                    case 2:
                        System.out.println("THEO TEN");
                        break;
                    case 3:
                        System.out.println("THEO HANG");
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid Input");
                }
            } while (choice < 0 || choice > 4);
            ArrayList<OldPhone> oldPhones = getOldPhones();
            switch (choice) {
                case 1:
                    System.out.println("THEO GIA");
                    System.out.println("Nhap vao  khoang gia ban muon tim: ");
                    System.out.println("Gia nho nhat: ");
                    int minPrice = Integer.parseInt(input.nextLine());
                    System.out.println("Gia lon nhat: ");
                    int maxPrice = Integer.parseInt(input.nextLine());

                    int count = 1;
                    for (Phone phone : oldPhones) {
                        if (phone.getPrice() <= maxPrice && phone.getPrice() >= minPrice) {
                            System.out.println("thong tin dien thoai thu: " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 2:
                    System.out.println("THEO TEN");
                    System.out.println("Nhap vao ten can tim: ");
                    String name = input.nextLine();
                    count = 1;
                    for (Phone phone : oldPhones) {
                        if (phone.getNamePhone().contains(name)) {
                            System.out.println("thong tin dien thoai thu: " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 3:
                    System.out.println("THEO HANG");
                    System.out.println("Nhap vao hang can tim: ");
                    String company = input.nextLine();
                    count = 1;
                    for (Phone phone : oldPhones) {
                        if (phone.getCompany().contains(company)) {
                            System.out.println("thong tin dien thoai thu: " + count++);
                            phone.output();
                        }
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }

    private static void searchNewPhone() {
        int choice;
        while (true) {
            do {
                System.out.println("Tim kiem theo tat ca cac dien thoai");
                System.out.println("1. Tim kiem theo gia");
                System.out.println("2. Tim kiem theo ten");
                System.out.println("3. Tim kiem theo hang");
                System.out.println("4. Thoat");
                System.out.println("Moi ban lua chon");
                choice = Integer.parseInt(input.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("THEO GIA");
                        break;
                    case 2:
                        System.out.println("THEO TEN");
                        break;
                    case 3:
                        System.out.println("THEO HANG");
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid Input");
                }
                ArrayList<NewPhone> newPhones = getNewPhone();
                switch (choice) {
                    case 1:
                        System.out.println("THEO GIA");
                        System.out.println("Nhap vao  khoang gia ban muon tim: ");
                        System.out.println("Gia nho nhat: ");
                        int minPrice = Integer.parseInt(input.nextLine());
                        System.out.println("Gia lon nhat: ");
                        int maxPrice = Integer.parseInt(input.nextLine());

                        int count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getPrice() <= maxPrice && phone.getPrice() >= minPrice) {
                                System.out.println("thong tin dien thoai thu: " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("THEO TEN");
                        System.out.println("Nhap vao ten can tim: ");
                        String name = input.nextLine();
                        count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getNamePhone().contains(name)) {
                                System.out.println("thong tin dien thoai thu: " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("THEO HANG");
                        System.out.println("Nhap vao hang can tim: ");
                        String company = input.nextLine();
                        count = 1;
                        for (Phone phone : newPhones) {
                            if (phone.getCompany().contains(company)) {
                                System.out.println("thong tin dien thoai thu: " + count++);
                                phone.output();
                            }
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Invalid Input");
                }
            } while (choice < 0 || choice > 4);
        }
    }
}
