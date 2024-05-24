package d14array_arraylist;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Try14 {
    public static void main(String[] args) {

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        //ArrayList'lere eleman nasil eklenir?
        ages.add(22);
        ages.add(32);
        ages.add(45);
        ages.add(18);
        ages.add(8);
        System.out.println(ages);
        //List'te araya eleman eklemek icin index numarasini yazariz
        ages.add(2,27);
        System.out.println(ages);
        ages.add(11);
        System.out.println(ages);
        //Ornek 1: Verilen Integer List'i, ages List'inin icine koyunuz
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        ages.addAll(list);
        System.out.println(ages);
        ages.addAll(0,list);
        System.out.println(ages);
        //size() metodu, ArrayList’teki öğelerin sayısını döndürür. (int return eder)
        System.out.println(ages.size());
        System.out.println(ages.get(4));
        ages.set(4,33);
        System.out.println(ages);
        //Ornek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak olarak değiştirin
        for (int w : ages){
            if (w % 2 != 0){
               ages.set(ages.indexOf(w),11);

            }

        }
        System.out.println(ages);














    }



    }

