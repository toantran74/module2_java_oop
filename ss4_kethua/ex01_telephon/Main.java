package ss4_kethua.ex01_telephon;

public class Main {
    public static void main(String[] args) {
        OldPhone oldPhone1 = new OldPhone();
        OldPhone oldPhone2 = new OldPhone();
        NewPhone newPhone1 = new NewPhone();
        NewPhone newPhone2 = new NewPhone();
        oldPhone1.input();
        newPhone1.input();

        oldPhone1.output();
        newPhone1.output();
    }
}
