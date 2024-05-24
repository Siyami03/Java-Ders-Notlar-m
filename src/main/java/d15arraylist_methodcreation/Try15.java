package d15arraylist_methodcreation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Try15 {
    public static void main(String[] args) {

        //Ornek 1: Bir tane Integer List olusturunuz. interview sorusu.
        //         Bu List'te birbirine en yakin iki tamsayiyi yaziniz.
        //         [12, 23, 10, 19] ==> 12 ve 10
        List<Integer> numbers = new ArrayList<>();
        numbers.add(15);
        numbers.add(23);
        numbers.add(10);
        numbers.add(19);
        numbers.add(32);
        numbers.add(45);
        numbers.add(20);
        System.out.println(numbers);
        numbers.sort(null);
        System.out.println(numbers);

        int minFark = numbers.get(1) - numbers.get(0);

        for (int i = 1; i < numbers.size() ; i++) {
            minFark = Math.min(minFark,numbers.get(i)-numbers.get(i-1));

        }
        System.out.println(minFark);

        for (int i = 1; i < numbers.size() ; i++) {
            if (numbers.get(i)-numbers.get(i-1) == minFark){
                System.out.println("Sayı 1 = " + numbers.get(i) + " ve Sayı 2 = " + numbers.get(i-1));

            }

        }



































    }
}
