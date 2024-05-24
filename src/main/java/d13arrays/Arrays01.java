package d13arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

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

        //Bir veriyi gormek icin ise;
        System.out.println(isimler[1]);     //Ayşe Hanım

        //--------------------------------------------------------------------------------------------------------------

        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //icerdigi karakter sayilari toplamini ekrana yazdirin.

        String[] cities = new String[5];
        cities[0] = "Bayburt";
        cities[1] = "Sivas";
        cities[2] = "Denizli";
        cities[3] = "Adana";
        cities[4] = "Ankara";

        //1.yol : for loop

        int totalChar = 0;
        for (int i = 0; i < cities.length; i++) {          //lenght field'dir. Alan okuması yapar.
            totalChar = totalChar + cities[i].length();    //lenght methoddur, aktif sayma yapar.
        }
        System.out.println(totalChar);  //30

        //2.yol ==> for each loop - enhanced - gelistirilmis loop:

        //for each loop:
        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop'taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w'nun kullanilmasidir.

        /*  for (DataType variable : array ya da collections)   {
                çalışacak kodlar }  */

        int sum = 0;

        for (String w : cities){
            sum = sum + w.length();
        }
        System.out.println(sum);

        //--------------------------------------------------------------------------------------------------------------

    }
}
