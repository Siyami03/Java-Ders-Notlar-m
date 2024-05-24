package d23oop_collections;

import java.util.*;

public class Try23 {
    public static void main(String[] args) {

        LinkedList<String> myList = new LinkedList<>();
        LinkedList<Integer> numberList = new LinkedList<>();

        myList.add("Siyami");
        myList.add("Ziyami");
        myList.add("Kiyami");
        myList.add("Ciyami");
        myList.add("Liyami");

        numberList.add(92);
        numberList.add(61);
        numberList.add(677);
        numberList.add(137);
        numberList.add(45);

        System.out.println(myList);
        System.out.println("--------------------------------------");
        System.out.println(numberList);
        System.out.println("---------------------------------------");

        //2- add(int index, E element); belirtilen konuma bir oge ekler
        myList.add(1,"Piyami");
        System.out.println(myList);
        System.out.println("---------------------------------------");

        //3- addFirst(E e): Listenin basina oge ekler
        myList.addFirst("Niyami");
        System.out.println(myList);
        System.out.println("--------------------------------------");

        //5) remove(Object o): Belirtilen öğeyi listeden kaldırır ve boolean dondurur. 3 farklı durumu var.
        myList.remove(0);
        System.out.println(myList);
        System.out.println("----------------------------------------");

        //6)removeFirstOccurrence() metodu, belirtilen bir öğeyi LinkedList içinde bastan başlayarak arar ve bu öğeyi
        // bulduğunda onu listeden kaldırır. Eğer bu öğe birden fazla kez bulunuyorsa, en bastaki öğe kaldırılır.
        //Eğer belirtilen öğe listede bulunmuyorsa, herhangi bir değişiklik yapmaz ve liste aynı kalır.
        myList.removeFirstOccurrence("Kiyami");
        System.out.println(myList);
        System.out.println("---------------------------------------");

        //8) peek() metodu, bir koleksiyonun ilk elemanına erişmek için kullanılır. Bu metod, elemanı koleksiyondan
        // kaldırmaz. Bu metod, koleksiyon boşsa null dondurur)
        String firstName = myList.peek();
        System.out.println(firstName);
        System.out.println("----------------------------------------");

        //9)poll() metodu, bir koleksiyonun başındaki elemanı alır ve koleksiyondan kaldırır. Bu metod, koleksiyon
        // boşsa null döndürür.



























    }
}
