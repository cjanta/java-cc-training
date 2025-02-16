package _300_390;

public class _370_DefaultWerteVonAttributen {

    // Attribute werden automatisch mit ihren Default-Werten initialisiert.
    // Dies gilt für statische Attribute und für Objekt-Attribute.

    // Die Werte sind wie bei den Arrays (siehe _150_Array)

    static int counter;

    double groesse;
    boolean geloescht;
    char buchstabe;
    String name;

    public static void main(String[] args) {

        // Klasse
        System.out.println(counter);  // 0

        // Objekt
        _370_DefaultWerteVonAttributen obj = new _370_DefaultWerteVonAttributen();
        System.out.println(obj.groesse);    // 0.0
        System.out.println(obj.geloescht);  // false
        System.out.println(obj.buchstabe);  //   - Null character
        System.out.println(obj.name);       // null

        // Lokale Variable MÜSSEN initialisiert werden !!!!!
        int alter;
        // System.out.println(alter);  // variable alter might not have been initialized

        String str;
        // str = str + "World";
        // System.out.println(str);
        str = null;
        System.out.println(str);  // null

    }
}
