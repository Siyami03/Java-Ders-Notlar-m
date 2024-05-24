package d12loops_arrays;

import java.util.Random;
import java.util.Scanner;

public class O6NumberGuessingGame {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.
        //Scanner ve Random class'larindan object uretelim

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 0-100 arasında rastgele sayı üretelim
        int rastgeleSayi = random.nextInt(101);  //20-100 arası nasıl oluurdu? Ödev.

        //Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim
        int denemeSayisi = 0;

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim
        int tahminEdilen;

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin bir boolean degisken olusturalim
        boolean tahminDogrumu = false;

        //Oyunun aciklamasini yazdiralim
        System.out.println("0-100 arasinda bir sayiyi tahmin etmeye calisin");

        //Dogru tahmin yapilincaya kadar donguyu devam ettirelim

        do {
            //Kullanıcıdan tahmin alıyoruaz.
            System.out.println("Tahmininizi yapınız");
            tahminEdilen = scanner.nextInt();

            //Sayacı bir artıralım
            denemeSayisi++;

            //Tahmini kontrol edelim.
            if (tahminEdilen < rastgeleSayi){
                System.out.println("Sayı daha büyük"); //Sayı kullanıcının tahmininden büyükse ipucu verdik.

            } else if (tahminEdilen > rastgeleSayi){
                System.out.println("Sayı daha küçük");

            } else {
                tahminDogrumu = true;
                System.out.println("Tebrikler, doğru tahmin");
                System.out.println("Deneme Sayısı : " + denemeSayisi);

            }

        } while (!tahminDogrumu);
        scanner.close();  //Açtığınız kaynakları kapatmak iyi bir proglama pratiğidir.

    }
}
