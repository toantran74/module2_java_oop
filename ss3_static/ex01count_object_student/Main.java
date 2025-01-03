package ss3_static.ex01count_object_student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Toan", 10);
        Student s2 = new Student(1, "Toan", 10);
        Student s3 = new Student(1, "Toan", 10);
        System.out.printf("Co %d doi tuong student da duoc tao ra trong bai toan nay!", Student.getCount());
    }
}
