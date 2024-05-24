package mentor_soru_ve_cozumler;

import java.util.Arrays;
import java.util.Scanner;

public class Subat_08_2024 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        /*Soru 1)Asagidaki multi dimensional array'in tum elemanlarinin carpimini ekrana yazdirin { {1,2,3}, {4,5,6} }*/

        int[][] sayi = {{1,2,3}, {4,5,6}};

        System.out.println(sayi.length); //2

        System.out.println(sayi[0].length);
        System.out.println(sayi[1].length);

        int carpim = 1;

        for (int i = 0; i < sayi.length; i++) {

            for (int j = 0; j < sayi[i].length; j++) {
                carpim = carpim * sayi[i][j];
            }
        }
        System.out.println("Carpim = " + carpim );

        //--------------------------------------------------------------------------------------------------------------

        /*Soru 2) Asagidaki multi dimensional array'in ic array'lerindeki son elemanlarin carpimini ekrana
                  yazdiran bir  program yaziniz { {1,2,3 }, {4,5}, {6} } */

        int[][] sayi1 = { {1,2,3 }, {4,5}, {6} };

        int carpim1 = 1;

        for (int i = 0; i < sayi.length; i++) {

            for (int j = sayi1[i].length - 1; j < sayi1[i].length ; j++) {
                carpim1 = carpim1 * sayi1[i][j];
            }
        }
        System.out.println("Carpim = " + carpim1);

        //--------------------------------------------------------------------------------------------------------------

        /*Soru 3)  Asagidaki  multi dimensional array'lerin  ic array'lerinde  ayni index'e  sahip elemanlarin
                   toplamini  ekrana yazdiran bir  program yaziniz.
                   (Zor soru) arrl = {  {1,2},{3,4,5}, {6} } ve arr2 = { {7,8,9 }, {10,11}, {12} }  */

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};


        int satirUzunlugu = Math.min(arr1.length, arr2.length);

        for (int i = 0; i < satirUzunlugu; i++) {
            int[] ic1 = arr1[i];
            int[] ic2 = arr2[i];

            int toplam = 0;

            for (int j = 0; j < Math.min(ic1.length,ic2.length); j++) {
                toplam = toplam + ic1[j] + ic2[j];
            }
            System.out.println("Satir " +(i+1)+ " toplam: "  + toplam);
        }

        //--------------------------------------------------------------------------------------------------------------

        /*Soru 4) Asagidaki multi dimensional array'in ic array'lerindeki tum elemanlarin toplamini birer birer bulan
                  ve herbir sonucu yeni bir array'in elemani yapan ve yeni array'i ekrana yazdiran bir program yaziniz
                  { {1,2,3 }, {4,5}, {6,7} }
                  Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==> output: {6, 9, 13}     */

        int[][] sayi2 = {{1, 2, 3}, {4, 5}, {6, 7}};

        int[] yeni = new int[sayi2.length];

        for (int i = 0; i < sayi2.length; i++) {

            int toplam2 = 0;

            for (int j = 0; j < sayi2[i].length; j++) {

                toplam2 = toplam2 + sayi2[i][j];
            }
            yeni[i] = toplam2;
        }

        for (int w : yeni){
            System.out.print(w + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(yeni));

        //--------------------------------------------------------------------------------------------------------------

        /*Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz :");

        String cumle = input.nextLine();

        String[] kelime = cumle.replaceAll("[^a-zA-Z0-9]"," ").split(" ");

        System.out.println(Arrays.toString(kelime));
        System.out.println("Kelime sayis = " + kelime.length);

        //--------------------------------------------------------------------------------------------------------------




    }
}
