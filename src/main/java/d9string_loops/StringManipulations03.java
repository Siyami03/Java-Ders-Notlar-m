package d9string_loops;

public class StringManipulations03 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        /*Ornek 1: Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin.

        1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.
        2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.
        3- Başında ve sonunda boşluk olmamalıdır.*/

        //Not: isEmpty() metodu sadece hicligi kontrol eder (true verir).
        //isBlank() metodu ise hem hicligi hemde space’i kontrol eder(true verir)

        //--------------------------------------------------------------------------------------------------------------

        //1- Parola hicbir sey girilmeden gecilmemeli, en az bir karakter icermelidir.

        String pwd = " ";
        boolean first = pwd.isEmpty();   //Sadece hiçliği kontrol eder. Space'i etmez. Space onun için bir karakterdir.
        System.out.println(first);

        //2- Karakterler sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir.

        boolean second = pwd.isBlank();
        System.out.println(second);

        //3- Başında ve sonunda boşluk olmamalıdır.
        //Başındaki ve sonundaki boşlukları alınca ilk haline eşitse orjinalinde boşluk yoktur.

        boolean third = pwd.trim().equals(pwd);
        System.out.println(third);

        if (first){
            System.out.println("parola hiç bir şey yazmadan geçilemez");

        }
        if (!second) {
            System.out.println("parola boş bırakılmamalı ve bşluk harici karakterler de bulunmalıdır");
        }

        if (!third){
            System.out.println("parolanın başında veya sonunda bırakılmamalıdır");
        }

        //--------------------------------------------------------------------------------------------------------------


    }
}
