package d6if_switch_ternary;

import java.util.Scanner;

public class IfStatements01Sade {
    public static void main(String[] args) {

        // BURADA if ve else if'lerin içlerini sadeleştirdik.

        Scanner input = new Scanner(System.in);
        System.out.println("Gün ismi giriniz");
        String gunIsmi = input.next();

        boolean haftaSonu = gunIsmi.equalsIgnoreCase("Cumartesi") ||
                gunIsmi.equalsIgnoreCase("Pazar");

        boolean haftaIci = gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Salı") ||
                gunIsmi.equalsIgnoreCase("Çarşamba") ||
                gunIsmi.equalsIgnoreCase("Perşembe") ||
                gunIsmi.equalsIgnoreCase("Cuma");

        if (haftaSonu){
            System.out.println("Hafta Sonu");

        } else if (haftaIci){
            System.out.println("Hafta İçi");

        } else {
            System.out.println("Geçerli Bir Gün İsmi Giriniz");
        }

    }
}
