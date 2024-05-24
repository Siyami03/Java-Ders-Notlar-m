package d24collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //Interview Sorusu : Ogrenci email adreslerini natural order’da siralanmis olarak depolayiniz.

        long t1 = System.nanoTime();                             //Performans testi

        //1.yol: Yavas - Cunku her elemanda siralama yapar.
        TreeSet<String> emails = new TreeSet<>();
        emails.add("k@gmail.com");
        emails.add("a@gmail.com");
        emails.add("z@gmail.com");
        emails.add("l@gmail.com");
        emails.add("u@gmail.com");
        emails.add("p@gmail.com");
        emails.add("g@gmail.com");
        emails.add("b@gmail.com");
        emails.add("t@gmail.com");
        emails.add("x@gmail.com");
        System.out.println(emails);     //[a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com, l@gmail.com, p@gmail.com,
                                        //t@gmail.com, u@gmail.com, x@gmail.com, z@gmail.com]

        //--------------------------------------------------------------------------------------------------------------

        long t2 = System.nanoTime();                             //Performans testi

        //Hizlandirmak icin eleman eklerken en hizli olandan(HashSet) yardim alalim
        //2.yol : Tavsiye edilir - Daha hizli

        HashSet<String> emailsHs = new HashSet<>();
        emailsHs.add("k@gamail.com");
        emailsHs.add("a@gamail.com");
        emailsHs.add("z@gamail.com");
        emailsHs.add("l@gamail.com");
        emailsHs.add("u@gamail.com");
        emailsHs.add("p@gamail.com");
        emailsHs.add("g@gamail.com");
        emailsHs.add("b@gamail.com");
        emailsHs.add("t@gamail.com");
        emailsHs.add("x@gamail.com");
        System.out.println(emailsHs);          //[k@gamail.com, l@gamail.com, x@gamail.com, p@gamail.com, u@gamail.com,
                                               //t@gamail.com, b@gamail.com, a@gamail.com, z@gamail.com, g@gamail.com]

        //Bos bir TreeSet olusturalim ve constructor'ina HashSet'i yazalim. Burada listeyi HashSet'te daha hızlı
        // oluşturmuş olduk. Sıralamayı TreeSet'te yaptık.

        TreeSet<String> emailsHsTs = new TreeSet<>(emailsHs);   //[a@gmail.com, b@gmail.com, g@gmail.com, k@gmail.com,
                                                                //l@gmail.com, p@gmail.com, t@gmail.com, u@gmail.com,
                                                                //x@gmail.com, z@gmail.com]
        //--------------------------------------------------------------------------------------------------------------

        //Performans testi yaptık. Listeyi HashSet'te sıralamayı da TreeSet'te yaparak hız kazanmış olduk.
        long t3 = System.nanoTime();

        System.out.println(t2 - t1);   //TreeSet bölümü          3570800
        System.out.println(t3 - t2);   //HashSet bölümü          320800

        //--------------------------------------------------------------------------------------------------------------
    }
}
