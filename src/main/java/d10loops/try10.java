package d10loops;

public class try10 {
    public static void main(String[] args) {

        //Ornek 2: Bir String’teki tekrarsiz karakterleri veren kodu yaziniz
        // Yusuf ==> Ysf

        String name = "Yusuf";
        String unique = "";
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (name.indexOf(ch) == name.lastIndexOf(ch)){
                unique = unique + ch;

            }

        }
        System.out.println("Tekrarsız : " + unique);















    }
}










