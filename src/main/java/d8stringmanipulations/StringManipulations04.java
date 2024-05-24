package d8stringmanipulations;

public class StringManipulations04 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //Ornek 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //String tv = “$456.99”;  String laptop = “$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv = "$456.99";
        String laptop = "$875.99";

        //valueOf() : Belirtilen String'i Double'a cevirir

        tv = tv.replace("$", "");
        laptop = laptop.replace("$", "");

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);
        System.out.println(totalPrice);   //1332.98

        //--------------------------------------------------------------------------------------------------------------

        //Ornek 2: Kullanici isminin ilk harflerini alip buyuterek console’a yazdiriniz.
        //      ”  ali cAN  ” ==> AC

        //trim() metodu bir String’deki bastaki ve sondaki bosluklari siler. Aradakileri silmez
        //split() String’i istediginiz karakterden parcalamaya yarar.
        //Not: Bir satirda, birden fazla methodu yanyana kullanirsaniz buna “method chain (zincir)” denir

        String name = "   ali cAN   ";
        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println(last);
        System.out.println(first + last);  //132 char sayısaldır. onun için karakterlerin sayısal değer karşılıklarını
        // topladı. Bunu aşmak için:
        System.out.println("" + first + last); // AC

        //char last = name.trim().toUpperCase().split("\\s+")[1].charAt(0); aradaki boşluk 1 den fazla yapılırsa böyle
        //yapılır.

        //--------------------------------------------------------------------------------------------------------------


    }
}
