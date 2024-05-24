package d21oop;

public class Vehicle {

    //------------------------------------------------------------------------------------------------------------------

    /*Soru : super() keyword'u kullanilarak parent class'taki constructor'lar degil de, variable'lar ve methodlar
    secilebilir mi?  Evet.

    Cevap : child'da bir constructor icinde, super yazip parantez koymadan, nokta koyup parent'taki variable veya
    methodlara ulasabiliriz */

    //------------------------------------------------------------------------------------------------------------------
    public Vehicle(){    //5

        this("Honda",2024,"Elektrikli");
        System.out.println("Honda, 2023, Benzin");
    }
    public Vehicle(String marka, int yil, String motor){    //6
        super();
        System.out.println("Honda, 2024, Elektrikli");

    //------------------------------------------------------------------------------------------------------------------
    }
}
