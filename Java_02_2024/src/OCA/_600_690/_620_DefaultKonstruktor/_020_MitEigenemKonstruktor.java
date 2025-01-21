package _600_690._620_DefaultKonstruktor;

class Seeloewe {

    String name;

    Seeloewe(String name) {
        this.name = name;
    }
}

public class _020_MitEigenemKonstruktor {

    // Wenn ein anderer Konstruktor vorhanden ist wird NICHT mehr
    // vom Java-Compiler automatisch der no-argument default constructor erzeugt.

    public static void main(String[] args) {

        Seeloewe sl = new Seeloewe("Frau Antje");
        System.out.println(sl.name);  // Frau Antje

        // Seeloewe sl2 = new Seeloewe();
        // reason: actual and formal argument lists differ in length
    }
}
