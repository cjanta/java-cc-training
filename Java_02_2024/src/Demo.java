



abstract class Abstrakt{

    static String objektAttribut = "objektAttribut";

    void sagHallo(){
        System.out.println("Hallo!");
    }

    abstract void abstrakteMethode();
}



class Konkret extends Abstrakt implements ICanDrucken{

    @Override
    void abstrakteMethode() {
        System.out.println("Ich war mal Abstrakt");
    }

    @Override
    public void drucken() {
        System.out.println("ich drucke");
    }
}



public class Demo {

    public static void main(String[] args) {
        Konkret konkret1 = new Konkret();
        System.out.println(konkret1.objektAttribut);
        System.out.println(konkret1.objektAttr);
        System.out.println(ICanDrucken.objektAttr);
        konkret1.sagHallo();
        konkret1.abstrakteMethode();


        // interface-Methoden aufrufe
        konkret1.drucken();


//        Abstrakt abstrakt = new Abstrakt(); // Fehler

//        ICanDrucken drucken1 = new ICanDrucken();

    }


    public String public_ = "public";           // +
    protected String protected_ = "public";    // #
    String packagePrivate_ = "public";          // ~
    private String private_ = "privat";          // -
}

