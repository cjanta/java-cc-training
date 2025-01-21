package _130_160.Aufgaben;

import java.util.Random;

public class _030_Begruessung {

    public static void main(String[] args) {

        /*
         * Begrüßung
         *
         * Es soll eine Begrüssung in Abhängingkeit zur Uhrzeit
         * ausgegeben werden.
         * Zwischen 22Uhr und 5Uhr: Gute Nacht
         * Vor 11Uhr: Guten Morgen
         * Vor 15Uhr: Mahlzeit
         * Vor 18Uhr: Guten Nachmittag
         * Vor 22Uhr: Guten Abend
         *
         * Die Stunde per Random zwischen 0 - 23 erstellen.
         */

         Random rand = new Random();
         int hour = rand.nextInt(24);
         System.out.println("Stunde: " + hour + "\n");

         if ( (hour >= 22 && hour <= 24) || (hour >= 0 && hour <= 5) ){
            System.out.println("Gute Nacht");
         }
         else if(hour <= 11){
            System.out.println("Guten Morgen");
         }
         else if(hour <= 15){
            System.out.println("Mahlzeit");
         }
         else if(hour <= 18){
            System.out.println("Guten Nachmittag");
         }
         else if(hour <= 22){
            System.out.println("Guten Abend");
         }
    }
}
