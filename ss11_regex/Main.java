package ss11_regex;

public class Main {
    public static void main(String[] args) {
        //a.
        System.out.println("(+84)324515111".matches("([(][+]84[)]|0)[3][2-9][0-9]{7}"));

        //b
        System.out.println("quoctoan090404@gmail.com".matches("[A-Za-z0-9]{6,32}@gmail\\.com"));

        //c
        System.out.println("Tran Quoc Toan".matches("[A-Za-z0-9._]{6,32}"));

        //d
        System.out.println("123123123az".matches(".{6,32}"));


    }
}