package d6if_switch_ternary;

import java.util.Scanner;

public class IfStatements01EqualsIgnoreCase {
    public static void main(String[] args) {

        // BURADA BÜTÜN equals'ları equals.IgnoreCase() YAPISINA ÇEVİRDİK. Böylelikle büyük/küçük harfe duyarlılık
        // kalktı.

        Scanner input = new Scanner(System.in);
        System.out.println("Gün ismi giriniz");
        String gunIsmi = input.next();

        if (gunIsmi.equalsIgnoreCase("Cumartesi") || gunIsmi.equalsIgnoreCase("Pazar")){
            System.out.println("Hafta Sonu");

        } else if (gunIsmi.equalsIgnoreCase("Pazartesi") ||
                gunIsmi.equalsIgnoreCase("Salı") ||
                gunIsmi.equalsIgnoreCase("Çarşamba") ||
                gunIsmi.equalsIgnoreCase("Perşembe") ||
                gunIsmi.equalsIgnoreCase("Cuma")){
            System.out.println("Hafta İçi");

        } else {
            System.out.println("Geçerli Bir Gün İsmi Giriniz");

        }


    }
}







