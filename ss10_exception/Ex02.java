package ss10_exception;

public class Ex02 {
    public static void main(String[] args) {

        try {
            String str = null;
            str.length();
            int a = 10/0;
        }catch(ArithmeticException e) {
            e.printStackTrace();
        }catch(NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");
    }
}
