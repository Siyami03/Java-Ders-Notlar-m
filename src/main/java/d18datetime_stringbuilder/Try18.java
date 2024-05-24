package d18datetime_stringbuilder;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Try18 {

    static int fiyat;

    static {
        LocalDate date = LocalDate.now();

        if (date.getMonthValue() == 2){
            fiyat=1000;
            System.out.println(fiyat);

        } else {
            fiyat=2000;
            System.out.println(fiyat);
        }
    }





    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Siayami");
        System.out.println(name);
        name.append("?");
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.capacity());
        System.out.println(name.reverse());
        System.out.println(name.deleteCharAt(0));
        System.out.println(name.delete(0,2));
        System.out.println(name.reverse());
















































    }
}
