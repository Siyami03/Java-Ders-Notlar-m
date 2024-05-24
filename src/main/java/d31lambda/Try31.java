package d31lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Try31 {
    public static void main(String[] args) {
        //System.out.println(sumFromSevenToSeventy());
        //System.out.println(getMuitipleExactFromThreeToNine());
        //System.out.println(getFactorial(5));
        System.out.println(getSumBetweenToNumber(5,10));


    }
    //1) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int sumFromSevenToSeventy(){
       return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();





    }
    //2) 3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    public static int getMuitipleExactFromThreeToNine(){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }
    //3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    public static int getFactorial(int x){
        if (x == 0){
            return 1;

        } else if (x < 0) {
            System.out.println("Negatif sayi");
            return -1;

        } else {return IntStream.rangeClosed(1,x).reduce(Math::multiplyExact).getAsInt();

        }

    }
    //4)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    //baslangic ve bitis dahil degil.
    public static int getSumBetweenToNumber(int a,int b){
        if (a > b){
            int temp = a;
            a = b;
            b = temp;

        }return IntStream.range(a+1,b).filter(Utils::isNumberEven).sum();

    }







}
