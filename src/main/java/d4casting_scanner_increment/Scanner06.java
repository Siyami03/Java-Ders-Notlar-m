package d4casting_scanner_increment;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        /*Ornek 6: Yeni Satir Karakteri ('\n') Hatasi: Ardışık olarak birden fazla Scanner nesnesiyle bilgi
        toplarken bazı girdilerin atlanması, genellikle Scanner'ın girdi akışını nasıl işlediğiyle ilgilidir.
        Bu durum, özellikle nextInt(), nextDouble() gibi sayısal girdi alan metodlardan sonra nextLine() metodunu
        kullanırken yaygın olarak karşılaşılır.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yasinizi giriniz");
        int age = scanner.nextInt();
        //Program calisirken yeni satir karakteri akısta kaldigindan "Adinizi giriniz" i okumadan satır atlıyor.
        //Bu durumu önlemek icin; boş bir scanner.nextLine(); yazıyoruz. Bu komut yeni satır karakterini harcamış
        //oluyor ve boylece "Adinizi giriniz" satırını okutmus oluyoruz.

        scanner.nextLine(); //Kullanilmayan yeni satir karakterini okuyup atar.
        System.out.println("Adinizi giriniz");
        String name = scanner.nextLine();

        //--------------------------------------------------------------------------------------------------------------

    }
}
