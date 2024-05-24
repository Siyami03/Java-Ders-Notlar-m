package d6if_switch_ternary;

import java.util.Scanner;

public class try06 {
    public static void main(String[] args) {

        //nested = ic ice gecmis demektir.
        /*ornek 1:
    Kisi erkek ise;
          i)16 yasindan kucuk ise calismamali
          ii)16 - 65(Dahil) arasi calismali
          iii)65 yasindan buyuk ise emekli olmali
    Kisi kadin ise;
         i)18 yasindan kucuk ise calismamali
         ii)18 - 60 (dahil) arasi calismali
         iii)60 yasindan buyuk ise emekli olmali
   Kisinin cinsiyetine ve yasina bakarak uygun mesaji console'a yaziniz*/

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz");
        String cinsiyet = input.next();
        System.out.println("yas gir");
        int age = input.nextInt();

        if (cinsiyet.equalsIgnoreCase("Erkek")){
            if (age < 16){
                System.out.println("Calısmamalı");

            } else if (age <66){
                System.out.println("Calısmalı");

            } else {
                System.out.println("Emekli olmalı");
            }

        } else if (cinsiyet.equalsIgnoreCase("Kadın")){
            if (age < 18){
                System.out.println("Calısmamalı");

            } else if (age <61){
                System.out.println("Calısmalı");

            } else {
                System.out.println("Emekli olmalı");
            }



        } else {
            System.out.println("Sizin durumunz tanım dısı");
        }











    }
}

