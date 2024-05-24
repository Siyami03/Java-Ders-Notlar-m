package d17passbyvalue_constructors_datetime;

public class Car {

    //------------------------------------------------------------------------------------------------------------------

    //oop-object-1-pasif-2-aktif
    //class - variable - method ==> object

    /*  1- Bir veri yapısı veya yardımcı bir class oluştururken, genellikle main methoduna ihtiyaç duymazsınız.
        2- Ancak bir uygulama geliştirirken veya bağımsız bir program çalıştırırken,
           main methodu oluşturmanız gerekebilir.
        3- Gercek projelerde genelde bircok class olur ve sadece 1 tane main method'lu class olur.
           Adına da "runner" eklenir.*/

    //------------------------------------------------------------------------------------------------------------------

    //1- variable'lar olusturalim (pasif ozellikler)

    String brand = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    //2- Method'lar oluşturalım (aktif özellikler)

    public void hareket(){
        System.out.println(brand + "hızlı hareket eder");
    }
    public void dur(){
        System.out.println(brand + "güvenli bir şekilde durur");
    }

    //(Bu şekilde çalışmaz. Çünkü main yok. Bunlar yardımcı class. Şimdi CarRunner'da main olan bir class oluşturacağız
    // ve bunları çağıracağız.)

    //------------------------------------------------------------------------------------------------------------------

    /*Constructor nedir?
      Classtan object olusturmamizi saglayan bolumdur.
      Class olusturdugumuzda Java bize otomatik olarak bir constructor verir.
      Bu constructor'lara "default constructor" denir.
      default constructor ===> Car () */

    //Ama car class’i bize hep ayni degerleri gonderir. Bu class’i kullanip farkli degerler olusturabiliriz.
    //Kendiniz constructor’inizi olusturdugunuz zaman Java default constructor’i siler

    //------------------------------------------------------------------------------------------------------------------

    //Custom (Parametreli) Constructor nasil olusturulur?

    //Access Modifier + Class ismi + () + {}

    //------------------------------------------------------------------------------------------------------------------

    /*Method ile Constructor arasindaki fark nedir? Interview Sorusu
    1)Methodlarda return type olur, constructor'larda olmaz
    2)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
    3)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir
    4)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar

    Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip object'ler olusturabiliriz*/

    //------------------------------------------------------------------------------------------------------------------

    //1.costructor'ı oluşturalım
    public Car(String brand, String model, int year, boolean hybrid){
        this.brand = brand;   //Buradaki brand'i kullanma ben sana brand'i dışarıdan parametre olarak göndereceğim.
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;    }

    //------------------------------------------------------------------------------------------------------------------

    //2.costructor oluşturabiliriz
    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;    }

    //------------------------------------------------------------------------------------------------------------------

    //3.costructor oluşturabiliriz. Kısa yol ile ==> sag tik >> Generate >> Constructor >> control'la sec >> ok
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;    }

    //------------------------------------------------------------------------------------------------------------------

    //toString oluşturalım. sağ tık "Generate" ==> toString ==> seçim işlemini yap ==> ok
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    //------------------------------------------------------------------------------------------------------------------
    }
}
