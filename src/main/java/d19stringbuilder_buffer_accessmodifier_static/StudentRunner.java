package d19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //Student class'tan bir instance olusturalim
        Student ali = new Student();

        System.out.println(ali.stdName);              //Ali Can - public
        System.out.println(ali.address);              //Istanbul- protected - ayni package'de olduğu için ulaştık.
        System.out.println(ali.email);                //alican@gmail.com - default- ayni package'de olduğu için ulaştık.
        //System.out.println(ali.tcKimlik);           //tcKimlik - private plduğu için ulaşamadık.
        System.out.println(ali);             //Student{stdName='Ali Can', address='İstanbul', email='alican@gmail.com'}

        //farkli package olsa, child'lar gorur

        //--------------------------------------------------------------------------------------------------------------

    }
}
