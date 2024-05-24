package d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Try29 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 13));
        tekrarsizCiftlerinKaresi(nums);

    }
    //1) Bir list'teki "Tekrarsiz" elemanlardan "çift" olanlarin "karesinin" "çarpımını" hesaplayan bir method oluşturun
    public static void tekrarsizCiftlerinKaresi(List<Integer> nums){
        int carpim = nums.stream().distinct().filter(t-> t % 2 == 0).map(t-> t * t).reduce(1,(t,u)-> t*u);
        System.out.println(carpim);





    }








}
