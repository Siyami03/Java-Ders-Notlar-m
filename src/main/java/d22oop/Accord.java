package d22oop;

public class Accord extends Honda{

    //------------------------------------------------------------------------------------------------------------------

    //8- Accord oluşturuldu. Burada da aynı işlemleri yapıyoruaz
    //9-Honda'nın child'ı yapıyoruz.
    //10-Override yaparak engine'i ekledik.
    //11-Süslü parantez ekledik.
    //12-abstrac'ı sildik.
    //13-sout ile içini biz doldurduk.
    //14-Şimdi HondaRunner'ı oluşturalım.

    //------------------------------------------------------------------------------------------------------------------

    @Override
    public void engine(){
        System.out.println("Gas 2.0 Turbo");
    }

    //------------------------------------------------------------------------------------------------------------------


}
