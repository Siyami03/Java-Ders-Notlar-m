package d17passbyvalue_constructors_datetime;

public class CarRunner {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //(Bir projede çok sayıda yardımcı class olur ama bir tane main'li class (Yani Runner class) olur ve hepsini
        //çalıştırır.)

        //car class'ından object üretelim

        //String s = new String(); orijinal      String s = "";     Kısa olanı
        //Car c1 = new Car();   Default Constructor. biz Car'da Custom Constructor'u oluşturduğumuzda burası silindi.
        Car c1 = new Car("BMW","3.20",2024,false);       //Default Constructor idi
                                                                                 //Custom Constructor oldu
        System.out.println(c1.brand);            //Honda    //BMW
        System.out.println(c1.model);            //Accord   //3.20
        System.out.println(c1.year);             //2023     //2024
        System.out.println(c1.hybrid);           //true     //false

        c1.hareket();                            //Honda hızlı hareket eder          //BMW hızlı hareket eder
        c1.dur();                                //Honda güvenli bir şekilde durur   //BMW güvenli bir şekilde durur

        //--------------------------------------------------------------------------------------------------------------

        Car c2 = new Car("Auidi","A5",2018,false);
        System.out.println(c2.brand);            //Auidi
        System.out.println(c2.model);            //A5
        System.out.println(c2.year);             //2018
        System.out.println(c2.hybrid);           //false

        System.out.println(c1);                  //@1554909b -- reference -- adres. Car'da toString oluşturmamız lazım
        System.out.println(c2);                  //6bf256fa  -- reference -- adres. Car'da toString oluşturmamız lazım

        //Java'da toString metodu genellikle bir nesnenin içeriğini okunabilir bir String olarak döndürmek için
        // kullanılır. toString'i Car'da oluşturduk. Sonuç:
        System.out.println(c1);                  //Car{brand='BMW', model='3.20', year=2024, hybrid=false}
        System.out.println(c2);                  //Car{brand='Auidi', model='A5', year=2018, hybrid=false}

        //--------------------------------------------------------------------------------------------------------------

        Car c3 = new Car("Fiat","Şahin");
        System.out.println(c3);                          //Car{brand='Fiat', model='Şahin', year=2023, hybrid=true}
                                                         //Biz sadece marka ve model yapmak istemiştik.

        //--------------------------------------------------------------------------------------------------------------


    }
}
