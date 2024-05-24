package d10loops;

public class ForLoops02 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //ornek 1: Verilen bir tamsayinin rakamlari toplamini console yazdiriniz
        //578 ==> 5+7+8=20 ==> Output 20 olmali
        // işlem sırası :
        // 578 % 10 = 8
        // ==> 578 / 10 = 57
        // ==> 57 % 10 = 7
        // ==> 57/10=5
        // ==> 5 % 10 = 5
        // ==>  5/10=0   0'da döngüyü kıracağız.

        int sum = 0;       //Burada int olduğu için hiçlik yapmadık. Topplamada etkisiz eleman olan 0'ı koyduk.

        for ( int i = 578 ; i > 0  ; i = i / 10 ){           //i /=10 da yazabilirdik
            sum = sum + i % 10;
        }
        System.out.println("sum = " + sum);

        //--------------------------------------------------------------------------------------------------------------

        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz
        // Yusuf ==> Ysf
        String t = "Yusuf";
        String unique = "";

        for (int i = 0; i < t.length() ; i++) {

            char ch = t.charAt(i);   //Biz index vereceğiz o bize harfi verecek.

            if (t.indexOf(ch) == t.lastIndexOf(ch)){
                unique = unique + ch;

            }

        }
        System.out.println("Tekrarsız : " + unique);

        //--------------------------------------------------------------------------------------------------------------


    }
}
