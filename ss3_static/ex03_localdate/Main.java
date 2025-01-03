package ss3_static.ex03_localdate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        String strdate1 = "19/03/2004";
        String strdate2 = "19/03/2005";
        LocalDate date1 = LocalDateUtil.fromString_ddMMyyyy(strdate1);
        LocalDate date2 = LocalDateUtil.fromString_ddMMyyyy(strdate2);
        System.out.println(date1);
        System.out.println(date2);
    }
}
