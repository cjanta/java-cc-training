package _010_090;

public class _040_String {

    public static void main(String[] args) {

        // String - Zeichenkette
        // Objekt einer Klasse -> Datentyp großgeschrieben
        // Reference type
        // Doppelte Anführungszeichen
        // unveränderbar - immutable

        String text = "Hello World";
        System.out.println(text);  // Hello World

        String text2 = new String("So geht es auch!");
        System.out.println(text2);

        // String Verkettung - Konkatenation
        // String concatenation
        // Pluszeichen als Operator

        String name = "Peter";
        System.out.println(text + name);        // Hello WorldPeter
        System.out.println(text + " " + name);  // Hello World Peter

        // Nur ein Operand muss ein String sein
        // Implizite Typenkonvertierung
        // Das Pluszeichen ist links assoziativ
        System.out.println(text + " " + 42);  // Hello World 42
        System.out.println(42 + text);        // 42Hello World
        System.out.println(42 + text);        // 42Hello World
        System.out.println(42);               // 42

        System.out.println(42 + 42 + text + 21 + 21);     // 84Hello World2121
        System.out.println((42 + 42) + text + 21 + 21);   // 84Hello World2121 (Beste Schreibweise)
        System.out.println(84 + text + 21 + 21);          // 84Hello World2121
        System.out.println((84 + text) + 21 + 21);        // 84Hello World2121
        System.out.println("84Hello World" + 21 + 21);    // 84Hello World2121
        System.out.println(("84Hello World" + 21) + 21);  // 84Hello World2121
        System.out.println("84Hello World21" + 21);       // 84Hello World2121
        System.out.println("84Hello World2121");          // 84Hello World2121

        // null
        String str = null;
        // System.out.println(str.getClass());  // NullPointerException

        // Konkatenation mit null
        System.out.println(null + "Hello");  // nullHello
        System.out.println(42 + "Hello");
        // System.out.println(42 + null);  // bad operand types
        String str2 = null;
        str2 += "Peter";
        System.out.println(str2);  // nullPeter

    }
}