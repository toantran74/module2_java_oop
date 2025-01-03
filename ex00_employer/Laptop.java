package ex00_employer;
class Laptop1 {
    int id;
    String name;
}
class oldLaptop extends Laptop1 {
    int yearUsed;
}
class newLaptop extends Laptop1 {
    int releaseYear;
}
public class Laptop {
    public static void main(String[] args) {
        newLaptop new1 = new newLaptop();
        Laptop1 lap1 = new1; // upcasting
        newLaptop new2 =(newLaptop) lap1; // downcasting

    }
}
