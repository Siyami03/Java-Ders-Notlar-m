package d27exceptions;

public class E03 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //3) StringIndexOutOfBoundsException, bir String nesnesinin karakter dizisindeki geçersiz bir indekse erişmeye
        //çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        karakterSec(s,2);

    }//main dısı
    public static void karakterSec (String s,int idx){
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index'leri kullanmayiniz : " + e.getMessage());
            //e.printStackTrace(); //kod yazan hatalari gormek isterse kullanilir. exception'i gosterir
            //ama exception firlatilmaz
        }
        System.out.println("App calisiyor"); //printStackTrace() calismayi durdurmaz

        //--------------------------------------------------------------------------------------------------------------
    }
}
