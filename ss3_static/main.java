package ss3_static;

public class main {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        myClass1.a++;
        myClass1.b++;

        myClass2.b++;
        myClass2.a++;

        System.out.println(myClass1.a);
        System.out.println(myClass1.b);


    }
}
