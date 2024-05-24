package d30lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Try30 {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();
        myList.add("Can");
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Banu");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");
        //bestenBuyukKarakterli(myList);
        //bestenAzKarakerli(myList);
        sirala(myList);




    }
    //ornek 14: Bir List’teki elemanlari tekrarsiz olarak, kucuk harflerle, uzunluklarina gore kucukten buyuge
    //siralayarak console’a yazdiran method’u olusturunuz.
    public static void sirala(List<String> myList){
        myList.stream().distinct().map(t-> t.toLowerCase()).sorted(Comparator.comparing(t-> t.length())).forEach(t-> System.out.print(t + ","));

    }









    }










