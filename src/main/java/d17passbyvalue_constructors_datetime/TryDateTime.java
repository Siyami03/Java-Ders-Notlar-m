package d17passbyvalue_constructors_datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TryDateTime {
    public static void main(String[] args) {

        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        DateTimeFormatter myDateKalib = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
        String myNewDate = myDateKalib.format(myDate);
        System.out.println(myNewDate);

        DateTimeFormatter myTimeKalib = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String myNewTime = myTimeKalib.format(myTime);
        System.out.println(myNewTime);

        LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);




















    }
}
