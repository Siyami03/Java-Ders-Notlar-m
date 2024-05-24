package d22oop;

public class Personel {


    public String name = "Siyami";
    private int tcNu = 123456;
    private boolean evlimi = true;
    private int personelNu = 137;
    private String sube = "Hayvan Saglıgı Subesi";


    public int getTcNu() {
        return tcNu;
    }

    public boolean isEvlimi() {
        return evlimi;
    }

    public int getPersonelNu() {
        return personelNu;
    }

    public String getSube() {
        return sube;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPersonelNu(int personelNu) {
        this.personelNu = personelNu;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }
}
