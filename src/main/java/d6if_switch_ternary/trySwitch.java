package d6if_switch_ternary;

import java.util.Scanner;

public class trySwitch {
    public static void main(String[] args) {

        /*Ornek 1: Gun isimlerini verince kacinci gun oldugunu yazdiran kodu yaziniz.
        Sunday==>1  . . .  Saturday==>7*/

        Scanner input = new Scanner(System.in);
        System.out.println("gun ismi gir");
        String dayName = input.next();

        switch (dayName.toLowerCase()){
            case "pazar":
                System.out.println("hafta sonu");
                break;
            case "pazartesi":
                System.out.println("hafta ici");
                break;
            case "salı":
                System.out.println(3);
                break;
            case "çarsamba":
                System.out.println(4);
                break;
            case "persembe":
                System.out.println(5);
                break;
            case "cuma":
                System.out.println(6);
                break;
            case "cumartesi":
                System.out.println(7);
                break;
            default:
                System.out.println("gecerli gün ismi gir");
        }



    }
}
