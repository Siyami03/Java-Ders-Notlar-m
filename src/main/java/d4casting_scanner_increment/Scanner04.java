package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //Ornek : 4  Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz.
        //i) Alanini hesaplayiniz. ==> kisa kenar * uzun kenar
        //ii) Cevrsini hesaplyiniz ==> 2*kisa kenar + 2*uzun kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdortgenin Kısa Kenar Uzunluğunu Giriniz");
        float shortSide = input.nextFloat();

        System.out.println("Dikdortgenin Uzun Kenar Uzunluğunu Giriniz");
        float longtSide = input.nextFloat();

        System.out.println("Alan = " + (shortSide * longtSide));
        System.out.println("Çevre = " + (2*shortSide + 2*longtSide));

        //ODEV : Kısa kenar, uzun kenar kontrlonu dongu ile yapiniz.

        //--------------------------------------------------------------------------------------------------------------




    }
}
