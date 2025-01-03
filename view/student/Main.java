package view.student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Tran Quoc Toan", 8.0);
        Student s2 = new Student(1, "Tran Quoc Toan", 9.0);
        System.out.println(s1.equals(s2));
        System.out.println(s1);
        System.out.println(s2);
    }
}
