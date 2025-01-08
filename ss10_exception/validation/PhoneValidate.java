package ss10_exception.validation;

import java.util.Scanner;

public class PhoneValidate {
    private static final Scanner sc = new Scanner(System.in);
    public static String inputName(String fieldName){
        while(true){
            try {
                System.out.printf("Nhap vao %s\n", fieldName);
                String name = sc.nextLine();
                CommonValidation.validateIsEmpty(name, fieldName);
                return name;
            }catch (Exception e){
                e.printStackTrace();
                System.out.printf(e.getMessage());
                System.out.printf("Vui long nhap lai!");
            }
        }
    }

    public static Double inputPrice(String fieldName){
        while(true){
            try {
                System.out.printf("Nhap vao %s\n", fieldName);
                String priceStr = sc.nextLine();
                CommonValidation.validateIsEmpty(priceStr, fieldName);
                double price = Double.parseDouble(sc.nextLine());
                CommonValidation.validateIsNegativeNumber(price, fieldName);
                return price;
            }catch (Exception e){
                e.printStackTrace();
                System.out.printf(e.getMessage());
                System.out.println("Vui long nhap lai!");
            }
        }
    }

    public static int inputWarranty(String fieldName){
        while(true){
            try{
                System.out.printf("Nhap vao %s\n", fieldName);
                String warrantyStr = sc.nextLine();
                CommonValidation.validateIsEmpty(warrantyStr, fieldName);
                int warranty = CommonValidation.parseInt(warrantyStr, fieldName);
                CommonValidation.validateIsNegativeNumber((double) warranty, fieldName);
                return warranty;
            }catch (Exception e){
                e.printStackTrace();
                System.out.printf(e.getMessage());
                System.out.println("Vui long nhap lai!");
            }
        }
    }
    public static Integer inputBatteryPercentage(String fieldName) {
        while(true){
            try {
                System.out.printf("Nhap vao %s\n", fieldName);
                String batteryPercentageStr = sc.nextLine();
                CommonValidation.validateIsEmpty(batteryPercentageStr, fieldName);
                int batteryPercentage = CommonValidation.parseInt(batteryPercentageStr, fieldName);
                CommonValidation.validateNumberOutOfRangeException(batteryPercentage, fieldName, 0, 100);
                return batteryPercentage;
            }catch (Exception e){

                e.printStackTrace();
                System.out.printf(e.getMessage());
                System.out.println("Vui long nhap lai!");
            }
        }
    }

    public static String inputDescription(String fieldName) {
        while(true){
            try {
                System.out.printf("Nhap vao %s\n", fieldName);
                String description = sc.nextLine();
                CommonValidation.validateIsEmpty(description, fieldName);
                //int batteryPercentage = CommonValidation.parseInt(batteryPercentageStr, fieldName);
               // CommonValidation.validateNumberOutOfRangeException(batteryPercentage, fieldName, 0, 100);
                CommonValidation.validateMinlength(description, fieldName, 10);
                return description;
            }catch (Exception e){

                e.printStackTrace();
                System.out.printf(e.getMessage());
                System.out.println("Vui long nhap lai!");
            }
        }
    }

    public static Integer inputQuantity (String fieldName) {
        while(true){
            try {
                System.out.printf("Nhap vao %s\n", fieldName);
                String quantityStr = sc.nextLine();
                CommonValidation.validateIsEmpty(quantityStr, fieldName);
                int quantity = CommonValidation.parseInt(quantityStr, fieldName);
                //CommonValidation.validateNumberOutOfRangeException(quantity, fieldName, 0, 100);
                CommonValidation.validateIsNegativeNumber((double) quantity, fieldName);
                return quantity;
            }catch (Exception e){

                e.printStackTrace();
                System.out.printf(e.getMessage());
                System.out.println("Vui long nhap lai!");
            }
        }
    }

    public static String inputCompany(String fieldName) {
        while(true){
            try {
                System.out.printf("Nhap vao %s\n", fieldName);
                String company = sc.nextLine();
                CommonValidation.validateIsEmpty(company, fieldName);
                //int batteryPercentage = CommonValidation.parseInt(batteryPercentageStr, fieldName);
                // CommonValidation.validateNumberOutOfRangeException(batteryPercentage, fieldName, 0, 100);
                //  CommonValidation.validateMinlength(company, fieldName, 10);
                return company;
            }catch (Exception e){

                e.printStackTrace();
                System.out.printf(e.getMessage());
                System.out.println("Vui long nhap lai!");
            }
        }
    }
}
