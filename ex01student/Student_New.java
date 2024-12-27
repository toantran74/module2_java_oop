package ex01student;

import java.util.Scanner;

public class Student_New {
     private String name;
     private double scoreMath;
     private double scoreLiterature;

    public Student_New() {
    }

    public Student_New(String name, double scoreMath, double scoreLiterature) {
        this.name = name;
        this.scoreMath = scoreMath;
        this.scoreLiterature = scoreLiterature;
    }
    void inputStudent(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        name = sc.nextLine();
        System.out.println("Enter student score: ");
        scoreMath = sc.nextDouble();
        System.out.println("Enter student score: ");
        scoreLiterature = sc.nextDouble();
    }
    double scoreMedium() {
        return (scoreMath * scoreLiterature)/2;
    }
    void outputStudent(){
//        System.out.println("===THÔNG TIN HỌC SINH===");
        System.out.println("Name: " + name);
        System.out.println("Score: " + scoreMath);
        System.out.println("Score: " + scoreLiterature);
        System.out.println("Score Medium: " + scoreMedium());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScoreMath() {
        return scoreMath;
    }

    public void setScoreMath(double scoreMath) {
        this.scoreMath = scoreMath;
    }

    public double getScoreLiterature() {
        return scoreLiterature;
    }

    public void setScoreLiterature(double scoreLiterature) {
        this.scoreLiterature = scoreLiterature;
    }
}
