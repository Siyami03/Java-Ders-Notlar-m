package d28exceptions_enum_iterators;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        //Cities c = new Cities ();  ===> ENUM'dan object olusturamazsiniz.

        //1- Enum daki bir sabite nasil ulasabiliriz?
        Cities il = Cities.GİRESUN;      //Data tipi Cities'tir.
        System.out.println(il);          //GİRESUN   ENUM sabitine ulastik.

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi);

        //3- Ankara'nin posta koduna ulasalim
        String postaKodu = Cities.ANKARA.getPostalCode();
        System.out.println(postaKodu);

        //4- Karabuk'un plaka koduna ulasalim
        int plakaKodu = Cities.KARABÜK.getPlateCode();
        System.out.println(plakaKodu);

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodunu giriniz");
        int plaka = input.nextInt();

        //values() methodu enum icindeki tum datalari bir array icinde bize verir
        Cities[] sehirler = Cities.values();
        //System.out.println(Arrays.toString(sehirler));

        if (plaka < 1 || plaka > 81){
            System.out.println("Lutfen 1 ile 81 arasi bir plaka kodu girinz");

        } else {
            for(Cities w : sehirler){
                if (plaka == w.getPlateCode()){
                    System.out.println("Girmis oldugunuz plaka " + w.getCityName() + " iline aittir");
                    break;
                }
            }
        }
    }
}
