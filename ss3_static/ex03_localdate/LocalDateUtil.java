package ss3_static.ex03_localdate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {
    private final static DateTimeFormatter formatter_ddMMyyyy = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private final static DateTimeFormatter formatter_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    // phuong thức tĩnh để chuyển đổi localDate sang ddMMyyyy
    public static LocalDate fromString_ddMMyyyy(String date){
        return LocalDate.parse(date, formatter_ddMMyyyy);
    }

    // phuong thức tĩnh để chuyển đổi localDate sang yyyyMMdd
    public static LocalDate fromString_yyyyMMdd(String date){
        return LocalDate.parse(date, formatter_yyyyMMdd);
    }

    // phuong thức tĩnh để chuyển đổi ddMMyyyy sang Localdate
    public static String toString_ddMMyyyy(LocalDate date){
        return date.format(formatter_ddMMyyyy);
    }
    // phuong thức tĩnh để chuyển đổi yyyyMMdd sang Localdate
    public static String toString_yyyyMMdd(LocalDate date){
        return date.format(formatter_yyyyMMdd);
    }

}
