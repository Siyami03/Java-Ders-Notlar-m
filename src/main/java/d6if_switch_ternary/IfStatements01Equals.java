package d6if_switch_ternary;

import java.util.Scanner;

public class IfStatements01Equals {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        String a = "Ali";
        String b = "Can";
        System.out.println(a+" "+b);

        //--------------------------------------------------------------------------------------------------------------

        /*Ornek 1: Kullanicinin vermis oldugu gün isimlerine bakarak Hafta Sonu veya Hafta ici olduguna karar veren kodu
         yaziniz.Pazartesi ==> Hafta ici       Cumartesi ==> Hafta sonu*/

        //equals() iki String’in birbirinin aynisi olup olmadigini kontrol eder.
        //Bu method boolean return eder.(true veya false). Büyük/küçük harfe duyarlıdır. Bu duyarlılığı kaldırmak için
        //egals.IgnoreCase yapısı kullanılır.

        //equalsIgnoreCase() iki String’in birbirinin aynisi olup olmadigini
        //buyuk kucuk harfi dikkate almadan kontrol eder

        Scanner input = new Scanner(System.in);
        System.out.println("Gün ismi giriniz");
        String gunIsmi = input.next();

        if (gunIsmi.equals("Cumartesi") || gunIsmi.equals("Pazar")){
            System.out.println("Hafta Sonu");

        } else if (gunIsmi.equals("Pazartesi") ||
        gunIsmi.equals("Salı") ||
        gunIsmi.equals("Çarşamba") ||
        gunIsmi.equals("Perşembe") ||
        gunIsmi.equals("Cuma")){
            System.out.println("Hafta İçi");

        } else {
            System.out.println("Geçerli Bir Gün İsmi Giriniz");

        }


    }
}
