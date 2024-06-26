package d12loops_arrays;

import java.util.Arrays;

public class O7Arrays01 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        /*  Array - Diz :
        1)Coklu data saklamaya izin veren yapilardir. Ornegin sinifinizdaki ogrencilerin isimleri.
        2)Array'ler tek data tipi depolayabilirler.Yani bir int dizisi sadece int değerler,
        bir String dizisi sadece String değerler saklayabilir.
        3)Array olusturmak icin i)Data Tipi ii)Data sayisi (Dizi boyutu için belirtilebilecek maksimum değer,
        Integer.MAX_VALUE (yaklaşık 2 milyar) olarak sınırlıdır) soylenmelidir.
        4)Array'ler diger Collectionlardan hizlidir çünkü boyutları sabittir
        5)Array'ler diger Collectionlardan daha az memory kullanirlar cünkü ekstra metadata veya işlevselliği yoktur.
        6)Array'ler hem primitive veri tiplerini (int, char, double vb.) hem de Object referanslarını
        (örneğin, String, Integer yani wrapper turleri gibi) saklayabilir.  */

        //--------------------------------------------------------------------------------------------------------------

        // Array oluşturmak
        String[] stdNames1 = new String[3];
        //String stdNames2[] = new String[4];   //Böyle de yazılabilir. Burada tavsye edilen birinci yazılan.

        //System.out.println(stdNames1); //@58ceff1 heap'teki adresi verdi. Array'i böyle yazdıramıyoruz.

        String[] stdNames2 = new String[3];
        System.out.println(Arrays.toString(stdNames2)); //[null, null, null]

        //Arrays, Java'da, Array'lerle calismak icin kulanilan yardimci bir class'tir.
        //Bu class'in icindeki toString() methodu Array'i yazdirmak icin kullanilir

        //--------------------------------------------------------------------------------------------------------------

        //ornek: 5 elemanli notlar adinda, int bir arrray olusturunuz ve console’a yazdiriniz

        int[] notlar = new int[5];
        System.out.println(Arrays.toString(notlar));

        //--------------------------------------------------------------------------------------------------------------

        //ornek: 10 elemanli integers adinda, Integer bir arrray olusturunuz ve console’a yazdiriniz

        Integer[] integers = new Integer[10];
        System.out.println(Arrays.toString(integers));

        //--------------------------------------------------------------------------------------------------------------

        //ornek: 3 elemanli isimler adinda, String bir array olusturunuz ve console’a yazdiriniz

        String[] isimler = new String[3];
        System.out.println(Arrays.toString(isimler));

        //Array'a eleman eklemek.

        isimler[0] = "Ali Can";
        isimler[2] = "Veli Han";
        isimler[1] = "Ayşe Hanım";   // biz sırasına göre yazmasak da java sıralı yazar.
        //isimler[0] = "Omer"; Hata vermez, uzerine yazar

        System.out.println(Arrays.toString(isimler));   //[Ali Can, Ayse Hanim, Veli Han]

        //--------------------------------------------------------------------------------------------------------------

    }
}
