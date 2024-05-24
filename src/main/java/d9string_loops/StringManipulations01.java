package d9string_loops;

public class StringManipulations01 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //Ornek 1: Bir String'in belirli bir karakterinden baslayarak belirli bir karaktere kadar
        // tum karakterleri dynamic olarak aliniz. abc@gmail.com ===> gmail

        //1.yol: hard code, tavsiye edilmez.
        String  a = "abc@gmail.com";
        System.out.println(a.substring(4, 9)); //gmail. Ama bu her ihtimal için çalışmaz.

        //2.yol : Dinamik

        String company1 = a.split("@")[1].split("\\.")[0];
        System.out.println(company1);

        //3.yol : Dinamik
        //indexOf() method’u spesifik bir karakterin ilk gorunumunun index’ini verir
        //Bu method olmayan karakterler icin -1 verir

        int startingIndex = a.indexOf("@");  //3 @ aldı. almaması için: a.indexOf("@") + 1; yapıyoruz.
        int endingIndex = a.indexOf(".");    //9
        int startingIndex1 = a.indexOf("@") + 1; // böyle yapıyoryz.

        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println(companyName);

        //--------------------------------------------------------------------------------------------------------------



    }
}
