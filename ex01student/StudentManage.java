    package ex01student;

    import java.util.ArrayList;
    import java.util.Scanner;

    public class StudentManage {
        public static void main(String[] args) {
//            Student_New s1 = new Student_New();
//            Student_New s2 = new Student_New();
//            Student_New s3 = new Student_New();
//            s1.inputStudent();
//            s2.inputStudent();
//            s3.inputStudent();
//            s1.outputStudent();
//            s2.outputStudent();
//            s3.outputStudent();
            Scanner sc = new Scanner(System.in);
            int n;
            do {
                System.out.println("Nhap so luong học sinh lớp bạn: ");
                n = sc.nextInt();
                if (!(n > 0 && n <= 100)) {
                    System.out.println("Vui lòng nhap lai!");
                }
            } while (!(n > 0 && n <= 100));
            ArrayList<Student_New> arrStudent = new ArrayList<>();
            Student_New st = new Student_New();
            for (int i = 0; i < n; i++) {
                System.out.printf("Nhap sinh vien thu %d: ", i + 1);
                System.out.println();
                st.inputStudent();
                arrStudent.add(st);
            }
            for (int i = 0; i < arrStudent.size(); i++) {
                System.out.printf("Xuat thong tin thu %d: ", i + 1);
                System.out.println();
                //st.outputStudent();
                arrStudent.get(i).outputStudent();
            }
        }
    }
