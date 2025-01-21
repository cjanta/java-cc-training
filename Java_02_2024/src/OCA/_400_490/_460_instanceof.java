package _400_490;

class Tier {
}

class Raubtier extends Tier {
}

class Tiger extends Raubtier {
}

public class _460_instanceof {

    // instanceof Operator

    public static void main(String[] args) {

        Tiger t1 = new Tiger();
        System.out.println(t1 instanceof Tiger);     // true
        System.out.println(t1 instanceof Raubtier);  // true
        System.out.println(t1 instanceof Tier);      // true
        System.out.println(t1 instanceof Object);      // true

        /*
        // Vorfahrenklasse als Referenz-Typ
        Raubtier t2 = new Tiger();
        Tier t3 = new Tiger();
        Object t4 = new Tiger();

        // Tiger t5 = new Raubtier();
        // incompatible types: Raubtier cannot be converted to Tiger
        */

        // Primitive Datentyp zum entsprechenden Objekt casten per (Object)
        // Der linke Operand muss ein Referenz-Typ sein (KEIN primitiver Datentyp)
        Double d1 = 4.567;
        System.out.println(d1 instanceof Double);  // true

        double d2 = 1.234;
        System.out.println((Object) d2 instanceof Double);  // true

        System.out.println(((Object) d2).getClass());  // class java.lang.Double
        System.out.println(((Object) d2).getClass());  // class java.lang.Double
        // System.out.println( (Object)d2.getClass() );  // double cannot be dereferenced

        // Der rechte Operand muss eine Klasse/Interface sein:
        Tier t6 = new Tiger();
        Raubtier r6 = new Raubtier();
        // System.out.println(r6 instanceof t6);  // java: cannot find class t6
    }
}
