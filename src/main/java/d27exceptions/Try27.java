package d27exceptions;

public class Try27 {
    public static void main(String[] args) {

        printAge(-25);


    } //main disi
    public static void printAge(int age){
        if (age < 0){
            throw new  IllegalArgumentException ("Yası negatif girme");

        } else {
            System.out.println(age);
        }

    }





















}
