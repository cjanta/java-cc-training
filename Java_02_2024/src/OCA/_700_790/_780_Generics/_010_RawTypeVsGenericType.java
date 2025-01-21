package _700_790._780_Generics;

import java.util.ArrayList;

public class _010_RawTypeVsGenericType {

    public static void main(String[] args) {

        // Raw type
        // Eine ArrayList mit Objekten der Klasse Object
        ArrayList objekte = new ArrayList<>();
        // ArrayList<Object> objekte = new ArrayList<>();
        objekte.add("Peter");
        objekte.add(117);
        objekte.add(new _010_RawTypeVsGenericType());
        System.out.println(objekte.get(0));  // Peter
        // String name = objekte.get(0);  // java: incompatible types: java.lang.Object cannot be converted to java.lang.String
        String name = (String) objekte.get(0);
        System.out.println(name);            // Peter
        System.out.println(objekte.get(1));  // 117
        System.out.println(objekte.get(2));  // ..._010_RawTypeVsGenericType@4554617c

        // Generics
        // Referenz-Typ in die diamond operator
        ArrayList<String> namen = new ArrayList<>();
        namen.add("Paul");
        String name2 = namen.get(0);
        System.out.println(name2);  // Paul

    }
}
