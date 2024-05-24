package d13arrays;

import java.util.Arrays;

public class Try13 {
    public static void main(String[] args) {

        //Ornek 4: [0, 2, 3, 0, 12, 0] arrayinde tum sifirlari sona yerlestiriniz.
        //         [0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]

        int[] numbers = {0,2,3,0,12,0};
        System.out.println(Arrays.toString(numbers));
        int[] newNumbers = new int[numbers.length];
        System.out.println(Arrays.toString(newNumbers));

        int ilkIndex = 0;

        for(int w : numbers){
            if (w != 0){
                newNumbers[ilkIndex] = w;
                ilkIndex++;

            }

        }
        System.out.println(Arrays.toString(newNumbers));









    }
}
