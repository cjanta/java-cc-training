package _600_690._620_DefaultKonstruktor;

class Seehund {
}

public class _010_OhneKonstruktor {

    // Wenn eine Klasse keinen Konstruktor hat,
    // wird automatisch vom Java-Compiler ein no-argument default constructor erzeugt.

    public static void main(String[] args) {

        Seehund sh = new Seehund();
        System.out.println(sh);  // ...Seehund@29453f44
    }
}
