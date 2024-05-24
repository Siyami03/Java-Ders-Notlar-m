package d25maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //meshur bir interview sorusu
        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini gosteren kodu
        //yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

        //Ali nasilsin Ali. ==> Ali 1 kere gozuktu. Java digerini Ali. olarak algilar
        //ali=2, nasilsin=1 ==> Bu map yapisi

        String s = "Ali nasilsin Ali.";
        s =s.replaceAll("\\p{Punct}","").toLowerCase();    //split burdan da devam edebilirdik
        System.out.println(s);                                               //ali nasilsin ali
        String[] kelimeler = s.split(" ");
        System.out.println(Arrays.toString(kelimeler));                      //[ali, nasilsin, ali]

        HashMap<String,Integer> myMap = new HashMap<>();
        System.out.println(myMap);                                           //{}

        for (String w : kelimeler){
            Integer gorunum = myMap.get(w);              //ilk dongu de, map'te ali olmadigindan value'su null gelecek
            if (gorunum==null){
                myMap.put(w,1);                          ////map'te yoksa w'dan 1 tane koy
            } else {
                myMap.put(w,gorunum+1);
            }
        }System.out.println(myMap);                       //{nasilsin=1, ali=2}

        //--------------------------------------------------------------------------------------------------------------

        //ornek 2: Size verilen bir String’deki her harfin o String’de kac defa kullanildigini gosteren kodu yaziniz.
        //“Hello” ==> H=1, e=1, l=2, o=1
        //#java_code_exercise_sharing  == ödev paylaşımı burdan

        //--------------------------------------------------------------------------------------------------------------

    }
}
