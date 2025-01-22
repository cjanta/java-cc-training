package bonusaufgaben;

public class _300_Shrink {

    public static void main(String[] args) {

        /*
         * Shrink
         *
         * Die Methode shrink() soll eine Zeichenkette auf n Zeichen kürzen.
         * Für n<15 liefert shrink() einfach die ersten n Zeichen.
         * Für größere n sollen die ersten n-10
         * und die letzten 5 Zeichen unverändert erhalten bleiben.
         * Dazwischen fügt die Funktion ' ... ' ein.
         *
         * Schreibe den Code für eine geeignete Methode,
         * und sicher die Methode bestmöglich gegen
         * die Übergabe ungültiger oder falscher Parameter ab.
         *
         * Drei Beispiele illustrieren die Funktionsweise:
         * 
         */
        System.out.println(shrink("abcdefghijklmnopqrstuvwxyz", 8));   // abcdefgh
        System.out.println(shrink("abcdefghijklmnopqrstuvwxyz", 17));  // abcdefg ... vwxyz
        System.out.println(shrink("abcdefghijklmnopqrstuvwxyz", 22));  // abcdefghijkl ... vwxyz

    }

    private static String shrink(String str, int shrink){

        if (str == null || str.isEmpty()){
            throw new IllegalArgumentException("Parameter: \"str\" darf nicht leer oder null sein.");
        }

        if (shrink < 0){
            throw new IllegalArgumentException("Parameter: \"shrink\" darf nicht negativ sein.");
        }

        if (shrink >= str.length()){
            return str;
        }

        if (shrink < 15) {
            return str.substring(0, shrink);
        } 
        else {
            int startLength = shrink - 10;
            return str.substring(0, startLength) + " ... " + str.substring(str.length() - 5);
        }

    }
}
