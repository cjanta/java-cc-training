package _200_290;

import java.util.Random;

public class _270_Switch {

    public static void main(String[] args) {

        // switch case
        // case ist nur der Einstiegspunkt!
        // Ohne break wird auch der nächste case ausgeführt.
        // Erlaubte Datentypen: int, String, byte, short, char, enum

        Random r = new Random();
        int num = r.nextInt(6) + 1;
        // num = 19;  // Fehler provozieren
        System.out.print(num + " entspricht: ");

        switch (num) {
            case 1:
                System.out.println("sehr gut");
                break;
            case 2:
                System.out.println("gut");
                break;
            case 3:
                System.out.println("befriedigend");
                break;
            case 4:
                System.out.println("ausreichend");
                break;
            case 5:
                System.out.println("mangelhaft");
                break;
            case 6:
                System.out.println("ungenügend");
            default:
                System.out.println("FEHLER");
                break;
        }

        int tag = r.nextInt(7) + 1;
        System.out.print(tag + " - ");

        switch (tag) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Schöne Woche");
                break;
            case 6:
            case 7:
                System.out.println("Schönes Wochenende");
                break;
            default:
                System.out.println("FEHLER");
        }


        // byte kann auch ein char sein, wenn der Wert in ein byte passt.
        byte b1 = 7;
        switch (b1) {
            case 'A':
            case -20:
            case 127:
                // case 'ß':  // java: incompatible types: possible lossy conversion from char to byte
        }

        // Konstante im switch
        // Sinnfrei, aber geht
        switch (23) {
            default:
                break;
        }


    }
}
