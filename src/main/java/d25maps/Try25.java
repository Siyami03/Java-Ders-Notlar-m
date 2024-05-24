package d25maps;

import java.util.*;

public class Try25 {
    public static void main(String[] args) {
        //Map nasil olusturulur?
        HashMap<String,Integer> mylist = new HashMap<>();

        mylist.put("Siyami",61);
        mylist.put("Ziyami",41);

       mylist.replace("Ziyami",45);
        System.out.println(mylist);
        mylist.replace("Siyami",61,55);
        System.out.println(mylist);
        System.out.println(mylist.get("Siyami"));
        System.out.println(mylist.containsKey("Kiyami"));
        System.out.println(mylist.containsKey("Siyami"));
        System.out.println(mylist.containsValue(92));
        System.out.println(mylist.containsValue(61));
        mylist.put("Piyami".toLowerCase(),137);
        System.out.println(mylist);
        mylist.remove("Ziyami");
        System.out.println(mylist);





























    }
}
