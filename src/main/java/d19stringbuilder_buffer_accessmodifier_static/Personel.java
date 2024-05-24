package d19stringbuilder_buffer_accessmodifier_static;

public class Personel {

    public String name = "Siyami";
    private int tcNu = 123456;
    protected String addres = "Burdur";
    String email = "03@gmail.com";


    @Override
    public String toString() {
        return "Personel{" +
                "name='" + name + '\'' +
                ", tcNu=" + tcNu +
                ", addres='" + addres + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
