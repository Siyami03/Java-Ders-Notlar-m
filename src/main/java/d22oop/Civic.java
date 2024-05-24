package d22oop;

public class Civic extends Honda {

    //------------------------------------------------------------------------------------------------------------------

    //2-Civic oluşturduk
    //3-Civic'i Honda'nın child'ı yapıyoruz. hata verdi çünkü engine'i kullanmak zorundayız.[ (3)Abstract method'lar tum
    // child class'lar tarafindan override edilmelidir yani kullanilmalidir.]
    //4-Override yaparak engine'i ekledik.
    //5-Süslü parantez ekledik.
    //6-Süslü parantez ekelyince abstrack olmaktan çıktı. çünkü abstrac'larda süslü parantez olmaz. onun için abstrac'
    //sildik.
    //7-sout ile içini biz doldurduk. bize ne yapmamız gerektiğini söyledi ama nasıl yapacağımızı bize bıraktı.
    //8-Accord'oluşturalım.

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void engine(){
        System.out.println("Gas 1.6 eco");
    }

    //------------------------------------------------------------------------------------------------------------------




}




