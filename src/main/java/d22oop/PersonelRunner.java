package d22oop;

public class PersonelRunner {
    public static void main(String[] args) {

        Personel per1 = new Personel();
        System.out.println(per1.name);
        System.out.println(per1.getTcNu());
        System.out.println(per1.isEvlimi());
        System.out.println(per1.getPersonelNu());
        System.out.println(per1.getSube());
        System.out.println("----------------------");

        per1.setPersonelNu(137);
        System.out.println(per1.getPersonelNu());
        per1.setSube("Biitki Koruma Subesi");
        System.out.println(per1.getSube());



    }
}
