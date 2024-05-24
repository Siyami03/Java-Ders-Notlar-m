package d27exceptions;

public class E06 {

    //------------------------------------------------------------------------------------------------------------------

    //5) NullPointerException:(bos isaretcisi) Null degerindeki bir variable referans olarak kullanildiginda olusur
    public static void main(String[] args) {
        String s = "Java";
        karakterSayisi(s);          //4

        String t = "";
        karakterSayisi(t);          //0

        String u = null;
        karakterSayisi(u);          //HATA

    } //main disi

    //------------------------------------------------------------------------------------------------------------------

    public static void karakterSayisi(String s){
        try {
            int a = s.length();
            System.out.println(a);
        } catch (NullPointerException e) {
            System.err.println("null degeriyle lenght() metodunu kullanmayyınız");
        }
    }
    //------------------------------------------------------------------------------------------------------------------
}
