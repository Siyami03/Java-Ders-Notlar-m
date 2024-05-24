package d16methodcreation_overloding_passbyvalue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Try16 {
    public static void main(String[] args) {

        int sonuc = toplama(4,5,6,20,5);
        System.out.println(sonuc);









    } public static int toplama(int...a){
        int sum = 0;
        for (int w : a){
            sum = sum + w;
        }return sum;

    }
}