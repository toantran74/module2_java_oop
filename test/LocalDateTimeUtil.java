package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeUtil {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
    public static String format(LocalDateTime localDate){
        return localDate.format(formatter);
    }
}
