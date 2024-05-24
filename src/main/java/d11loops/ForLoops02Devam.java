package d11loops;


import java.util.Scanner;

public class ForLoops02Devam {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        Scanner input = new Scanner(System.in);

        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int sutun = input.nextInt();

        //int satir = 2;
        //int sutun = 2;

        for (int i = 1; i <= satir; i++) {

            for (int j = 1; j <= sutun; j++) {
                System.out.print("X ");
            }
            System.out.println(); //pointer'i alt satira almak icin kullanildi
        }

        //--------------------------------------------------------------------------------------------------------------

        //Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        /*

         *
         * *
         * * *
         * * * *

         */
        for (int i = 1; i < 5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }

            System.out.println();
        }

        //--------------------------------------------------------------------------------------------------------------


    }
}
