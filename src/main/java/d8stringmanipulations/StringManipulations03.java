package d8stringmanipulations;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String pwd = input.nextLine();

        //i)En az 8 karakter olsun
        boolean lenghtControl = pwd .length() > 7;
        System.out.println("LenghtControl =  " + lenghtControl);

        //ii)Space karakteri password'de olmasin
        //space hariç hersey silinecek, 0 tane mi diye bakılacak
        boolean spaceControl = pwd.replaceAll("[^ ]", "").isEmpty(); //length()==0'de yazabilirdik.
        System.out.println("spaceControl = " + spaceControl);

        //iii)En az bir tane buyuk harf olsun. Büyük harf hariç hersey silinecek
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("upperCaseControl = " + upperCaseControl );

        //iv)En az bir tane kucuk harf olsun
        boolean lowerCaseControl = pwd.replaceAll("[^a-z]","").length() > 0;
        System.out.println("lowerCaseControl = " + lowerCaseControl);

        //v)En az bir tane rakam olsun
        boolean numberControl = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("numberControl = " + numberControl);
        //Bu extra oldu. Hatanın sebebini gösterme.
        if (!numberControl){
            System.out.println("Sifre an az bir rakam icermelidir");
        }

        //ODEV : En az 1 tane sembol içermeli. #java_code_exercise_sharing da paylas.

        boolean isValid = lenghtControl && spaceControl && upperCaseControl && lowerCaseControl && numberControl;
        if (isValid){
            System.out.println("sifre gecerlidir");

        } else {
            System.out.println("sifre gecersizdir");

        }

        if (!lenghtControl){
            System.out.println("şifre en az 8 karakter olmalıdır.");

        }if (!spaceControl){
            System.out.println("şifrede boşluk olamaz");

        }if (!upperCaseControl){
            System.out.println("şifrede en az bir büyük harf olmalıdır.");

        }if (!lowerCaseControl){
            System.out.println("şifrede en az bir küçük harf olmalıdır.");

        }if (!numberControl){
            System.out.println("şifrede en az bir rakam olmalıdır.");

        }

        //--------------------------------------------------------------------------------------------------------------


    }
}
