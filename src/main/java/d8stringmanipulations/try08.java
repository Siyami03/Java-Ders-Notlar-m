package d8stringmanipulations;

import java.util.Scanner;

public class try08 {
    public static void main(String[] args) {

        //Ornek 3: Bir String’in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        String a = "abc@gmail.com";
        String a1 = a.split("@")[1].split("\\.")[0];

        System.out.println(a1);




















    }
}
