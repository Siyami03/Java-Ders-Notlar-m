package d8stringmanipulations;

import java.util.Scanner;

public class BenimYaptıgım03 {
    public static void main(String[] args) {

        /*Ornek 1: Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.

        i)En az 8 karakter olsun
        ii)Space karakteri password'de olmasin
        iii)En az bir tane buyuk harf olsun
        iv)En az bir tane kucuk harf olsun
        v)En az bir tane rakam olsun */

        Scanner input = new Scanner(System.in);
        System.out.println("şifre gir");
        String pwd = input.nextLine();

        boolean lenghtControl = pwd.length() > 7;
        if (lenghtControl){

        } else {
            System.out.println("en az 8 karakter olmalı");
        }

        boolean spaceControl = pwd.replaceAll("[^ ]","").isEmpty();
        if (spaceControl){

        } else {
            System.out.println("boşluk olmamalı");
        }
        boolean upperCaseControl = pwd.replaceAll("[^A-Z]","").length() > 0;
        if (upperCaseControl){

        } else {
            System.out.println("en az bir büyük harf olmalı");

        }
        boolean lowerControl = pwd.replaceAll("[^a-z]","").length() > 0;
        if (lowerControl){

        } else {
            System.out.println("en az bir küçük harf olmalı");
        }
        boolean numControl = pwd.replaceAll("[^0-9]","").length()>0;
        if (numControl){

        } else {
            System.out.println("en az bir rakam olmalı");
        }
        boolean isValid = lenghtControl&&spaceControl&&upperCaseControl&&lowerControl&&numControl;
        if (isValid){
            System.out.println("şifre geçerli");

        } else System.out.println("şifre geçerli değil");








    }
}
