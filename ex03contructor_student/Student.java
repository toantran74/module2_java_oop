package ex03contructor_student;

public class Student {
    private int id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        if(name.trim().equals(""))
        {
            System.out.println("Name cannot be empty");
        }
        else {
            this.name = name;
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
        if(score < 0 || score > 10){
            System.out.println("Score Invalid");
        }
        else {
            this.score = score;
        }
    }

    public int getId() {
        return id;
    }
    void xuat() {
        System.out.println("id" + id);
        System.out.println("name" + name);
        System.out.println("score" + score);
    }
}
