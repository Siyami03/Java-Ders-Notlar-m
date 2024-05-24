package d21oop;

public class Dog extends Mammal {

    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void eat (){
        System.out.println("Dogs eat...");
    }
    public void bark (){
        System.out.println("Dogs bark...");

    //------------------------------------------------------------------------------------------------------------------
    }
    @Override
    public Animal create (){          //Data type Animal'dır
        return new Animal();          //Animal ürettik, dışarı Animal verdk.
                                      //Çünkü parent'in data tipi child'in data tipini kapsar
    }
    @Override
    public int add(int a, int b) {
        return a + b;
                                 //primitive'lerde return type degistirilemez. cunku burada parent-child iliskisi yoktur
    }
    @Override
    public Integer carpma(Integer a, Integer b) {
        return a * b;
    }

    //------------------------------------------------------------------------------------------------------------------
}
