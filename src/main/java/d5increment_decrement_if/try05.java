package d5increment_decrement_if;

import java.util.Scanner;

public class try05 {
    public static void main(String[] args) {

        /*Ornek 1: Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore yazdiran kodu
        olusturunuz

        0-4 (dahil) ==> bebek
        5-12 (dahil)==> cocuk
        13-20 (dahil) ==> genc
        21-30 (dahil) ==> yetiskin
        30 ustu ==> Tanimlanmamis
        yazdiriniz*/

        Scanner input = new Scanner(System.in);
        System.out.println("yas gir");
        int sayi = input.nextInt();

        if (sayi < 0){
            System.out.println("negatif olamaz");

        } else if(sayi < 5 ){
            System.out.println("Bebek");

        }else if(sayi < 13 ){
            System.out.println("Cocuk");

        }else if(sayi < 21 ){
            System.out.println("Genc");

        }else if(sayi < 31 ){
            System.out.println("Yetişkin");

        } else {
            System.out.println("Tanımlanmamıs");
        }







    }
}
