package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123

        //Cozum : İlk iki basamgı elde etmek icin; 45678 / 1000 yapacagız. Bu işlemde java virgulden sonraki sayıları
        //sildigi icin 45'elde etmis oluruz.
        //Son iki basamgı elde etmek icin; 45678 / 100 işleminde "Kalan" ı yani 78'i alacagız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bes basamakli bir sayi giriniz");
        int num = input.nextInt();        //Java'da bir tamsayiyi baska tamsayiyla bolunce sonuc tamsayi cıkar.
        int ilkIki = num / 1000;

        //% isaretine modulus operatoru denir. Kalan bulunur.
        int sonIki = num%100;   //num'i 100'e bol, bana kalni ver.

        System.out.println(ilkIki + sonIki );

        //--------------------------------------------------------------------------------------------------------------



    }
}
