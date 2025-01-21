package _600_690;

class Person {
    String name;
}

public class _600_PassByValue {

    // Java passes everything per value

    public static void main(String[] args) {

        // Bei den acht primitiven Datentypen und beim String, wird der Wert übergeben
        // Dies gilt auch für die Wrapper-Klassen
        int int1 = 23;
        System.out.println(int1);  // 23
        changeInt(int1);
        System.out.println(int1);  // 23
        String str1 = "Hello";
        System.out.println(str1);  // Hello
        changeString(str1);
        System.out.println(str1);  // Hello

        // Bei Referenz-Typen (Objekten) ist der Wert eine Referenz auf das Objekt
        Person p1 = new Person();
        p1.name = "Peter";
        System.out.println(p1.name);  // Peter
        changePerson(p1);
        System.out.println(p1.name);  // Zacharias

        Integer int2 = 42;
        System.out.println(int2);  // 42
        changeInt(int2);
        System.out.println(int2);  // 42

        // Wenn man will, dass sich der äußere Wert ändert:
        int int3 = 77;
        int3 = changeInt2(int3);
        System.out.println(int3);  // 176
    }

    static void changeInt(int z) {
        z += 99;
    }

    static int changeInt2(int z) {
        return z + 99;
    }

    static void changeString(String s) {
        s += "World";
    }

    static void changePerson(Person p) {
        p.name = "Zacharias";
    }

}
