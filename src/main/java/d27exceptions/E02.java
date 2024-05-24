package d27exceptions;

public class E02 {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
        String s = "1234a";
        convertStringToInt(s);

    } //main disi
    public static void convertStringToInt(String s){

        //Hata beklenen kodlar try içine yazılır

        try {
            int intS = Integer.valueOf(s);
            System.out.println(intS + 1);
        } catch (NumberFormatException e){
            System.out.println("Donusum icin rakam disi karakter kullanmayiniz : " + e.getMessage());
        } //Donusum icin rakam disi karakter kullanmayiniz : For input string: "1234a"

        //FileWriter, PrintWriter ile exception'lari disariya alabiliriz

        //--------------------------------------------------------------------------------------------------------------
    }
}