package test;

import javax.xml.namespace.QName;

public class Student {
    private static String school = "Nguyen Hue";
    private String name;
    private static void printSchool() {
        System.out.println(school);
       // System.out.println(name); // loi
        System.out.println(school);
    }
    public void printName() {
        System.out.println(name);
        System.out.println(school);
    }
    static {
        school = "Chu Van An";
    }
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        Student.school = school;
    }

    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        //s.setSchool("TXQT");
        s3.name = "hello";
        Student.school = "Nguyen Hue";
        System.out.println(s.getSchool());
        System.out.println(s4.getSchool());
        System.out.println(s2.getSchool());
        System.out.println(s3.getSchool());
    }
}
