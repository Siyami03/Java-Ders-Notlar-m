package d23oop_collections;

import d22oop.AudiS5;

public class AudiRunner {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //Motor m = new Motor(); HATA: Interface'lerden object uretemezsiniz

        AudiA4 a4 = new AudiA4();
        a4.turbo();                     //Audi A4 turbo motor kullanir
        a4.analog();                    //Audi A4 analog klima kullanir
        a4.esp();                       //Audi A4 esp fren sistemi kullanir
        //a4.run();                     //Auidi A4 havayastigi calistirir
        ((Motor)a4).run();              //Auidi A4 havayastigi calistirir
        //Motor interface'den gelen run() methodu çalıştı

        //Motor.fiyat = 500; //final ispati.yeni deger atayamazsiniz

        System.out.println(Motor.fiyat); //300
        System.out.println(Klima.fiyat); //200
        System.out.println(Fren.fiyat); //100

        Motor.hiz(); //Saatte 250km
        a4.guc(); //200HP


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("----------------------------");

        AudiS5 s5 = new AudiS5();
        s5.eco();
        s5.dijital();
        s5.abs();

        //--------------------------------------------------------------------------------------------------------------
        }
    }

