package d21oop;

public class AnimalRunner {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------

        Dog d = new Dog();
        d.eat();                             //Dogs eat...
        d.bark();                            //Dogs bark....
        d.feedWithMilk();                    //Mammals feed their babies with milk
        d.drink();                           //Animals drink...


        //Bird class'tan obje üretelim
        Bird b = new Bird();
        b.tweet();                           //Birds tweet.....
        b.drink();                           //Animals drink...

        Cat c = new Cat();
        c.feedWithMilk();                  //Cats feed their babies with milk

        //--------------------------------------------------------------------------------------------------------------
    }
}
