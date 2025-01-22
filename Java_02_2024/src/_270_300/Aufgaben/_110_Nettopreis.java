package _270_300.Aufgaben;

public class _110_Nettopreis {

    public static void main(String[] args) {

        /*
         * Nettopreis
         *
         * Schreibe Methoden zum Berechnen des Nettopreises.
         * Den Methoden soll der Bruttopreis übergeben werden
         * und sie sollen den Nettopreis zurück geben.
         * Der Mehrwertsteuersatz soll als zweiter Parameter
         * übergeben werden können.
         * Der Standardwert des Mehrwertsteuersatzes soll 19 sein.
         * Der Algorithmus zum Berechnen des Nettopreises soll nur in einer Methode vorkommen.
         */

        System.out.println(berechneNettoPreis(116, 16));  // 100.0
         System.out.println(berechneNettoPreis(119));      // 100.0
        }

        private static double berechneNettoPreis(int brutto){
            return berechneNettoPreis(brutto, 19);
        }
         
        private static double berechneNettoPreis(int brutto, int tax) {
            return  brutto / (100 + tax) * 100; 
        }
}
