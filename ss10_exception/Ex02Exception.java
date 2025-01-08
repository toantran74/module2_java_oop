package ss10_exception;

import ss10_exception.exception.UnderYearsOldException;

import java.util.Scanner;

public class Ex02Exception {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // kiem tra tuoi hop le
        int age;
        while (true) {
            try {
                age = inputAgeOver18();
                break;
            } catch (UnderYearsOldException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(age);
    }
    public static int inputAgeOver18() throws UnderYearsOldException {
        System.out.println("Enter age: ");
        int age = Integer.parseInt(sc.nextLine());
        if(age < 18){
           throw new UnderYearsOldException("Bạn chưa du tuoi de dang ki");
        }
        return age;
    }
}
