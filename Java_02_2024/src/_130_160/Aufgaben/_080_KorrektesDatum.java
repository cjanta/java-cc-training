package _130_160.Aufgaben;

public class _080_KorrektesDatum {

    public static void main(String[] args) {

        /*
         * Korrektes Datum
         *
         * Die Meyer GmbH benötigt ein Modul,
         * das ein Datum auf Korrektheit prüft.
         * Ist das zu prüfende Datum korrekt,
         * so ist die Variable datok auf 1, andernfalls auf 0
         * zu setzen.
         *
         * Beispiele:
         *
         * 29.02.1999 - datok: 0
         * 29.02.2000 - datok: 1
         * 13.05.2000 - datok: 1
         * 32.05.2000 - datok: 0
         * 24.13.2000 - datok: 0
         *
         * Für die Jahre gilt: jahr > 1900 && jahr < 2100
         */

         System.out.println(istDatumKorrekt(29, 2, 1999)); // Erwartet: 0
         System.out.println(istDatumKorrekt(29, 2, 2000)); // Erwartet: 1
         System.out.println(istDatumKorrekt(13, 5, 2000)); // Erwartet: 1
         System.out.println(istDatumKorrekt(32, 5, 2000)); // Erwartet: 0
         System.out.println(istDatumKorrekt(24, 13, 2000)); // Erwartet: 0
        
    }
    
    public static int istDatumKorrekt(int tag, int monat, int jahr) {
        // Jahr prüfen
        if (jahr <= 1900 || jahr >= 2100) {
            return 0;
        }

        // Monat prüfen
        if (monat < 1 || monat > 12) {
            return 0;
        }

        // Anzahl der Tage im Monat bestimmen
        int[] tageImMonat = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Schaltjahr berücksichtigen
        if (monat == 2 && istSchaltjahr(jahr)) {
            tageImMonat[1] = 29;
        }

        // Tag prüfen
        if (tag < 1 || tag > tageImMonat[monat - 1]) {
            return 0;
        }

        // Alles korrekt
        return 1;
    }

    private static boolean istSchaltjahr(int jahr) {
        // Schaltjahrregel: Jahr ist durch 4 teilbar und (nicht durch 100 oder durch 400 teilbar)
        return (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0));
    }
    

   
}
