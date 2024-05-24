package d22oop;

public class AudiS5 implements Motor,Klima,Fren{

    //------------------------------------------------------------------------------------------------------------------

    //Motor
    public void eco(){     System.out.println("Audi S5 motor ekonomiktir");    }
    public void turbo(){        System.out.println("Audi S5 motor turbodur");    }
    public void gas (){        System.out.println("Audi S5 motor benzinlidir");    }


    //Klima
    public void analog (){        System.out.println("Audi S5 klima analogdur");    }
    public void dijital (){        System.out.println("Audi S5 klima dijitaldir");    }

    //Fren
    public void abs(){        System.out.println("Audi S5 fren abs dir");    }
    public void esp(){        System.out.println("Audi S5 fren eps dir");    }

    //------------------------------------------------------------------------------------------------------------------

}
