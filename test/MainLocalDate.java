package test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MainLocalDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String locaDate = LocalDateTimeUtil.format(today.atStartOfDay());
        System.out.println(locaDate);
    }
}
