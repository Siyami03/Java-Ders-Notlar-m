package d6if_switch_ternary;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
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
        //--------------------------------------------------------------------------------------------------------------

        Scanner input = new Scanner(System.in);
        System.out.println("Cinsiyetinizi Giriniz");
        String gender = input.next();

        System.out.println("Yaşınızı Giriniz");
        int age = input.nextInt();

        if (gender.equalsIgnoreCase("Erkek")){

            if (age < 0){
                System.out.println("Yaş negatif olamaz");

            } else if (age < 16){
                System.out.println("Çalışmamalı");

            } else if (age <= 65){
                System.out.println("Çalışmalı");

            } else {
                System.out.println("Emekli Olmalı");

            }

        } else if (gender.equalsIgnoreCase("Kadın")){

            if (age < 0){
                System.out.println("Yaş negatif olamaz");

            } else if (age < 18){
                System.out.println("Çalışmamalı");

            } else if (age <= 60){
                System.out.println("Çalışmalı");

            } else {
                System.out.println("Emekli Olmalı");
            }

        } else {
            System.out.println("Sizin için farklı bir tanımlama yapılmadı");

        }

    }

}
        //--------------------------------------------------------------------------------------------------------------
