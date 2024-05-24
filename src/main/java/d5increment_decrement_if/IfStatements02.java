package d5increment_decrement_if;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

       //Ornek 1: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz.

        //1.Yol :

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.println("Cift Sayi");
                    }

        if (num % 2 != 0){       //num % 2 == 1 de yazabilirdik.
            System.out.println("Tek Sayi");
        }

        //2.Yol : if-else statements
        //condition dogruysa (true) if blogu, condition yanlissa (false) else blogu calisir
        //if else'de sadece biri calisabilir

        if (num % 2 == 0){
            System.out.println("Sayi cifttir");
        }

         else {
        System.out.println("Sayi Tektir");

        }

         //-------------------------------------------------------------------------------------------------------------

    }

}
