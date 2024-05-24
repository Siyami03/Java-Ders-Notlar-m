package mentor_soru_ve_cozumler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subat_09_2024 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        /*
        1- Elemanlari  A, C, E, ve F olan bir String  ArrayList  olusturup  ekrana yazdiriniz.

        2- Indexsiz add() methodunu kullanarak, B'yi ekleyiniz.
        index'li add() methodunu kullanarak, L'yi 1 numarali index'e ekleyiniz. ArrayList'i  ekrana
        yazdiriniz, list  goyle olmali; A, L, C, E, F, B.

        3- set()  methodu kullanarak, E'yi D yapiniz.
            ArrayList'i  ekrana yazdiriniz, list  goyle olmali; A, L, C, D, F, B.

        4- remove() methodu kullanarak, F'yi siliniz.
            ArrayList'i  ekrana yazdiriniz, list  goyle olmali; A, L, C, D, B.

        5) sert() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        ArrayList'i  ekrana yazdiriniz, list  goyle olmali; A, B, C, D, L.
        6) contains() methodu kullanarak, L'nin list'de var oldugunu ve M'nin list'de var olmadigini
        dogrulayiniz.
        7) size() methodu kullanarak, list'in kag eleman oldugunu ekrana yazdiriniz.
        8) clear() methodu kullanarak, list'deki tum elemanlari siliniz.
        9) isEmpty() methodu kullanarak, list'deki tum elemanlarin silindigini dogrulayiniz       */

        //--------------------------------------------------------------------------------------------------------------

        //1- Elemanlari  A, C, E, ve F olan bir String  ArrayList  olusturup  ekrana yazdiriniz.

        List<String> harf = new ArrayList<>();

        harf.add("A");
        harf.add("C");
        harf.add("E");
        harf.add("F");

        System.out.println(harf); //[A, C, E, F]

        //--------------------------------------------------------------------------------------------------------------

        /*2- Indexsiz add() methodunu kullanarak, B'yi ekleyiniz.
        index'li add() methodunu kullanarak, L'yi 1 numarali index'e ekleyiniz. ArrayList'i  ekrana
        yazdiriniz, list  goyle olmali; A, L, C, E, F, B.*/

        harf.add("B");
        harf.add(1,"L");
        System.out.println(harf); //[A, L, C, E, F, B]

        //--------------------------------------------------------------------------------------------------------------

       /*3- set()  methodu kullanarak, E'yi D yapiniz.
            ArrayList'i  ekrana yazdiriniz, list  goyle olmali; A, L, C, D, F, B. */

        /*harf.set(3,"D");        System.out.println(harf);//[A, L, C, D, F, B]*/

        for (int i = 0; i <harf.size() ; i++) {
            if (harf.get(i).contains("E")){
                harf.set(i,"D");
            }
        }
        System.out.println(harf);//[A, L, C, D, F, B]

        //--------------------------------------------------------------------------------------------------------------

        /*4- remove() methodu kullanarak, F'yi siliniz.
            ArrayList'i  ekrana yazdiriniz, list  goyle olmali; A, L, C, D, B.     */

        harf.remove("F");
        System.out.println(harf);//[A, L, C, D, B]

        //--------------------------------------------------------------------------------------------------------------

        /*5) sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
        ArrayList'i  ekrana yazdiriniz, list  goyle olmali; A, B, C, D, L.  */

        //Collections.sort(harf);
        harf.sort(null);
        System.out.println(harf); //[A, B, C, D, L]

        //--------------------------------------------------------------------------------------------------------------

        /*6) contains() methodu kullanarak, L'nin list'de var oldugunu ve M'nin list'de var olmadigini
             dogrulayiniz. */

        if (harf.contains("L")){
            System.out.println("L listte var");
        }
        if (!harf.contains("M")){
            System.out.println("M listte yok");
        }

        //--------------------------------------------------------------------------------------------------------------

        //7) size() methodu kullanarak, list'in kag eleman oldugunu ekrana yazdiriniz.

        System.out.println("List'in " + harf.size() + " elemani var"); //List'in 5 elemani var

        //--------------------------------------------------------------------------------------------------------------

        //8) clear() methodu kullanarak, list'deki tum elemanlari siliniz.

        harf.clear();
        System.out.println(harf); //[]

        //--------------------------------------------------------------------------------------------------------------

        // 9) isEmpty() methodu kullanarak, list'deki tum elemanlarin silindigini dogrulayiniz

        if (harf.isEmpty()){
            System.out.println("List'in tum elemanlari silinmistir.");
        }else {
            System.out.println("List'te en az bir eleman var");
        }

        //--------------------------------------------------------------------------------------------------------------

        /*SORU 1 Bir dogal sayi listesi oluturun ve olusturdugunuz listedeki tum ogeleri toplayin   */

        List<Integer> sayi = new ArrayList<Integer>();

        sayi.add(1);
        sayi.add(2);
        sayi.add(3);
        sayi.add(4);
        sayi.add(5);
        sayi.add(6);

        System.out.println(sayi); //[1, 2, 3, 4, 5, 6]

        int toplam = 0;

        for (Integer i : sayi) {

            toplam = toplam + i;
        }
        System.out.println(toplam);//21

        //--------------------------------------------------------------------------------------------------------------

        /*SORU 2 Bir dogal sayi listesi olusturun ve olusturdugunuz listedeki cift ogeleri toplayin     */

        /*List<Integer> sayi = new ArrayList<Integer>();

        sayi.add(1);
        sayi.add(2);
        sayi.add(3);
        sayi.add(4);
        sayi.add(5);
        sayi.add(6);

        System.out.println(sayi); //[1, 2, 3, 4, 5, 6]

        int toplam = 0;

        for (Integer i : sayi) {
            if (i %2 == 0){
                toplam += i;
            }
        }
        System.out.println(toplam); //12*/

        //--------------------------------------------------------------------------------------------------------------

         /*SORU 3 Verilen bir listede tekrar eden sayilari sadece 1 tane yapip yeni liste atiniz.     */

       /* List<Integer> sayi = new ArrayList<Integer>();

        sayi.add(1);
        sayi.add(2);
        sayi.add(1);
        sayi.add(4);
        sayi.add(5);
        sayi.add(2);
        sayi.add(3);
        sayi.add(4);
        sayi.add(6);

        System.out.println(sayi); //[1, 2, 1, 4, 5, 2, 3, 4, 6]

        List<Integer> yeni = new ArrayList<>();

      *//*  for (int i = 0; i < sayi.size(); i++) {

            if (!yeni.contains(sayi.get(i))){

                yeni.add(sayi.get(i));
            }
        }         *//*

        for (Integer w : sayi){

            if (!yeni.contains(w)){
                yeni.add(w);
            }
        }
        System.out.println(yeni); //[1, 2, 4, 5, 3, 6]
*/
        //--------------------------------------------------------------------------------------------------------------

         /*SORU 4 Bir listede ortalamanin ustunde olan eleman sayisini bulunuz      */

        /*List<Double> sayi = new ArrayList<>();

        sayi.add(1.4);
        sayi.add(3.2);
        sayi.add(2.8);
        sayi.add(5.1);
        sayi.add(4.6);
        sayi.add(2.7);

        System.out.println(sayi); //[1.4, 3.2, 2.8, 5.1, 4.6, 2.7]

        double toplam = 0;

        for (Double w : sayi) {

            toplam += w;

        }
        System.out.println(toplam); //19.8

        double ortalama = toplam / sayi.size();

        System.out.printf("%.2f\n",ortalama); //3,30

        sayi.sort(null);
        System.out.println(sayi); //[1.4, 2.7, 2.8, 3.2, 4.6, 5.1]*/

        //--------------------------------------------------------------------------------------------------------------

         /*SORU 5 İki Array'de ortak bulunan elementleri bir list'e ekleyiniz ve list'i yazdırınız.
          (case sensitivity olmadan)
          String[] arr = {"John","Brad","Angel","Sofia","Emily"};
          String[] brr = {"sofia","brad","grace","emily","hazel"};
          Output : [Brad,Sofia,Emily]     */

        String[] arr = {"John","Brad","Angel","Sofia","Emily"};
        String[] brr = {"sofia","brad","grace","emily","hazel"};

        List<String> list = new ArrayList<>();

        for (String w : arr) {

            for (String s : brr) {

                if (w.equalsIgnoreCase(s)){
                    list.add(s);
                }
            }
        }
        System.out.println("Ortak elmanlar : " + list);

        //--------------------------------------------------------------------------------------------------------------

         /*SORU 6 Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz. Daha sonra 10'dan buyuk olan tum
           elemanları 2 katına cıkarınız   */

        /*List<Integer> sayi = new ArrayList<Integer>();

        sayi.add(1);
        sayi.add(2);
        sayi.add(3);
        sayi.add(4);
        sayi.add(5);
        sayi.add(6);
        sayi.add(7);
        sayi.add(8);
        sayi.add(9);
        sayi.add(10);
        sayi.add(11);
        sayi.add(12);
        sayi.add(13);
        sayi.add(14);
        sayi.add(15);
        System.out.println(sayi); //[1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15]*/

     /*   List<Integer> sayi = new ArrayList<Integer>();

        for (int i = 1; i < 16; i++) {
            sayi.add(i);
        }
        System.out.println(sayi);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]*/


        List<Integer> sayi1 = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        System.out.println(sayi); //[1, 2, 3, 4, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15]


        for (int i = 0; i < sayi1.size(); i++) {

            if (sayi1.get(i) > 10) {

                sayi1.set(i, sayi1.get(i) * 2);
            }
        }
        System.out.println(sayi1); //[1, 2, 3, 4, 5, 7, 8, 9, 10, 22, 24, 26, 28, 30]



        //--------------------------------------------------------------------------------------------------------------










    }
}
