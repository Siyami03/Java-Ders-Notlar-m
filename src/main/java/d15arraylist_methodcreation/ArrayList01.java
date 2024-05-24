package d15arraylist_methodcreation;
import java.util.ArrayList;


public class ArrayList01 {
    public static void main(String[] args) {


        //--------------------------------------------------------------------------------------------------------------


        ArrayList<Integer> ages = new ArrayList<>(); //Type Inference - Tip cikarimi

        ages.add(9);
        ages.add(12);
        ages.add(5);
        System.out.println(ages); //[9, 12, 5]

        ages.add(1, 28);
        System.out.println(ages); //[9, 28, 12, 5] 1.ondex'teki saga otelendi

        //12 ile 5 arasina 7 ekleme
        ages.add(3, 7);
        System.out.println(ages); //[9, 28, 12, 7, 5]

        //En sona 11 ekleme
        ages.add(11);
        System.out.println(ages); //[9, 28, 12, 7, 5, 11]

        //--------------------------------------------------------------------------------------------------------------

        //Ornek 1: Verilen Integer List'i, ages List'inin icine koyunuz

        ArrayList<Integer> newAges = new ArrayList<>();

        newAges.add(1);
        newAges.add(2);
        newAges.add(3);

        ages.addAll(newAges);
        System.out.println(ages);          //[9, 28, 12, 7, 5, 11, 1, 2, 3]
        System.out.println(newAges);       //[1, 2, 3]

        ages.addAll(0,newAges);
        System.out.println(ages);          //[1, 2, 3, 9, 28, 12, 7, 5, 11, 1, 2, 3]

        //size() metodu, ArrayList’teki öğelerin sayısını döndürür. (int return eder)

        int elemanSayisi = ages.size();
        System.out.println(elemanSayisi);  //12

        //--------------------------------------------------------------------------------------------------------------

        //get(int index) metodu, ArrayList’te belirli bir konumdaki ogeye erismek icin kullanilir.
        Integer eleman = ages.get(3);    //Java Integeri int'e çevirdi (unboxing)
        System.out.println(eleman);

        //set(int index, E element) metodu, ArrayList'te belirtilen indeksteki öğeyi verilen yeni öğeyle değiştirir.
        // Bu metot, listedeki bir öğeyi güncellemek için kullanılır. Metot, eski öğeyi döndürür.
        Integer a = ages.set(1,25);
        System.out.println(a);
        System.out.println(ages);






    }
}
