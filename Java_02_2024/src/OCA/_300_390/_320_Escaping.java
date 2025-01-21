package _300_390;

public class _320_Escaping {

    public static void main(String[] args) {

        // Escaping & Maskieren
        // Im Englischen ist beides escape sequence
        // Per Backslash \

        // Maskieren
        // Einem normalen Zeichen eine Bedeutung geben
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tWorld");

        // Escaping
        // Einem Zeichen seine syntaktische Bedeutung nehmen
        System.out.println("Er sagte: \"Hallo\"");  // Er sagte: "Hallo"
        System.out.println("Zum Escapen benutzt man den Backslash (\\)");  // Zum Escapen benutzt man den Backslash (\)
        System.out.println("\\\\".length());  // 2
        System.out.println("\\\\");  // \\
        System.out.println("Hello\nWorld".length());  // 11 (Der Backslash zählt nicht mit)

    }
}
