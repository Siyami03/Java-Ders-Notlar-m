package d12loops_arrays;

public class O1WhileLoops01 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //ÖDEV ==> Ornek 2: 23'den 12'ye kadar cift tamsayilari console’a yazdiriniz(12 dahil)

        int a = 23;
        while (a > 11) {

            if (a % 2 == 0) {
                System.out.print(a + ",");
            }
            a--;
        }

        //--------------------------------------------------------------------------------------------------------------


    }
}
