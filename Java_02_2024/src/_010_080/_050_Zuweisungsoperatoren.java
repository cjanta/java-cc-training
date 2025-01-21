package _010_080;

public class _050_Zuweisungsoperatoren {

    public static void main(String[] args) {

        int x = 7;
        System.out.println(x + 7); // diese Operation verändert x nicht
        System.out.println(x);

        x = x + 1;
        System.out.println(x); // erst jetzt hat x einen anderen Wert


        System.out.println("Zuweisungsoperatoren += -= *= /= %=");

        System.out.println(x += 2);
        System.out.println(x);
        System.out.println(x -= 2);
        System.out.println(x);
        System.out.println(x *= 2);
        System.out.println(x);
        System.out.println(x /= 2);
        System.out.println(x);
        System.out.println(x %= 2);
        System.out.println(x);


        System.out.println("\n String Addition");
        String text = "die Antwort auf das Leben, das Universum und Alles ist ";

        text += 42;
        System.out.println(text);
//        text -= 42;                   Fehler
//        System.out.println(text);
        text += ".";
        System.out.println(text);

    }
}
