package d11loops;

import java.util.Scanner;

public class try11 {
    public static void main(String[] args) {

        //Ornek 2: Verilen sayıda ondalık kısımdaki rakamların toplamını bulunuz.
        //28.587 ==> 5+8+7=20
        double sayi = 28.587;
        String strSayi = String.valueOf(sayi);
        String ondalikKisim = strSayi.split("\\.")[1];
        int intSayi = Integer.valueOf(ondalikKisim);

        int sum = 0;
        for (int i = intSayi; i > 0 ; i = i / 10) {
            sum = sum + i % 10;

        }
        System.out.println(sum);













    }
}
