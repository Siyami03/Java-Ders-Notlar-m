package d18datetime_stringbuilder;

import d19stringbuilder_buffer_accessmodifier_static.Student;

public class BaskaPackageClass {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        //Package 19 Student class'da oluşturduğumuz objelerin hangilerine ulaştığını görmek için bu class'ı package
        // 18'de oluşturduk.

        Student veli = new Student();
        System.out.println(veli.stdName);   //Ali Can

        System.out.println(veli.toString());   ////veri sizintisi

        //--------------------------------------------------------------------------------------------------------------

    }
}
