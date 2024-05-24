package d4casting_scanner_increment;

import java.util.Scanner;

public class try04 {
    public static void main(String[] args) {

        //Ornek 5: Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz
        //           45678 ==> 45 + 78 = 123

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamaklı sayı gir");
        int sayi = input.nextInt();

        int firstNumber = sayi/1000;
        int secondNumber = sayi % 100;
        System.out.println("TOPLAM = " + (firstNumber + secondNumber));
































    }
}
