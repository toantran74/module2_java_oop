package ss3_static.ex01count_object_student;

public class Student {
    private int mssv;
    private String name;
    private double score;
    private static int count = 0;


    public Student(int mssv, String name, double score) {
        this.mssv = mssv;
        this.name = name;
        this.score = score;
        count++;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public static int getCount() {
        return count;
    }
}
