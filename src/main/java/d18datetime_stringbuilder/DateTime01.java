package d18datetime_stringbuilder;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Scanner;

public class DateTime01 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //ornek 1: Kullanicidan aldiginiz tarih gecmise ait ise "Gecersiz tarih girdiniz" mesaji veriniz.
        //Kullanicidan aldiginiz tarih gelecege ait ise "Zamani girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        LocalDate girilenTarih = null;           // ya da ==>  LocalDate girilenTarih;

        while (true){                                                  //true:Ben bu dögüyü içerden kıracağım
            System.out.println("Lutfen yılı giriniz :");
            int year = input.nextInt();                                //Kullancıdan yıl bilgisini aldık

            System.out.println("Lutfen ayı giriniz (1-12) :");
            int month = input.nextInt();

            if(month < 1 || month > 12){
                System.out.println("Ay 1 ile 12 arasında olmalıdır. Lütfen tekrar deneyiniz");
                continue;                                              //Kullanıcıyı döngünün başına yönlendirir
            }

            System.out.println("Lutfen günü giriniz");
            int day = input.nextInt();

            //O ayin kac cektigini bulmak icin, girilen yil ve ay icin YearMonth objesi olusturulur.

            YearMonth yearMonth = YearMonth.of(year,month);           //O ayın maksimum gün sayısı hesaplanır
            int daysInMonth = yearMonth.lengthOfMonth();              //daysInMonth'un içinde şubat olsaydı 29 olurdu

            if(day < 1 || day > daysInMonth){
                System.out.println("Girilen ay için geçersiz gün. Lutfen tekrar deneyiniz");
                continue;                                           //Kullaniciyi dongunun basina yonlendirir
            }

            girilenTarih = LocalDate.of(year,month,day);             //Girilen bilgilerle LocalDate objesi olusturduk

            if(girilenTarih.isBefore(LocalDate.now())){
                System.out.println("Geçersiz tarih girdiniz. Lutfen tekrar deneyiniz");

            } else {
                System.out.println("Zamani girebilirsiniz");
                break;                                              //Gecerli tarih girildi, donguden cik
            }
        }
        //--------------------------------------------------------------------------------------------------------------
    }
}
