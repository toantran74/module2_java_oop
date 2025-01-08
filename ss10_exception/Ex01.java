package ss10_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex01 {
    public static void main(String[] args) {
        try {
            readFile();
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }
        System.out.println("Chuong trinh ket thuc khong loi lam");
    }
    static void readFile() throws FileNotFoundException {
        File file = new File("src/ex02time/Tie.java");
        FileReader fileReader = new FileReader(file);
    }
}
