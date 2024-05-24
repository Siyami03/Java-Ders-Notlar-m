package d20instanceblock_oop;

public class InstanceBlock2 {

    //Tüm constructor'ların içinde çalışması gereken kodlar var ise tekrardan kurtulmak için bu kodları instance block
    //içine yazarız. Şimdi 1 değişken 2 constructor oluşturalım.

    public int year;                 //Değişken

    {        System.out.println("Herkese selam");    }

    public InstanceBlock2() {                        //Parametresiz constructor
        //System.out.println("Herkese selam");       //instance block oluşturduktan sonra bunu yukarıya aldık.
    }

    public InstanceBlock2(int year) {                //Parametreli constructor
        //System.out.println("Herkese selam");         Bunu da sildik      //Tekrar istenmez
        this.year = year;
    }

    //------------------------------------------------------------------------------------------------------------------
}
