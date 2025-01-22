package bonusaufgaben;

public class _320_Frosch {

    public static void main(String[] args) {

        /*
            Frosch

            In dieser Aufgabe lernen wir einen besonderen Frosch kennen,
            so wie ihn sich nur Mathematiker ausdenken können.
            Besonders seine Art, eine Straße zu überqueren, macht es zweifelhaft,
            ob er in der realen Welt lange überleben könnte.

            Er überquert eine 2,50 Meter breite Straße wie folgt:

            Mit dem ersten Sprung legt er
            die erstaunliche Distanz von einem Meter zurück,

            dann springt er wegen zunehmender Erschöpfung mit jedem weiteren Schritt
            immer nur noch halb so weit wie vorher.

            Die Entfernung, die er dabei zurücklegt,
            berechnet sich also als Summe der Werte
            1 + 0,5 + 0,25 + 0,125 und so weiter.

            Versuche, mittels eines Programms herauszubekommen, ob der Frosch
            es auf die andere Straßenseite schafft.

			Zusatz:
			Ermittle durch eine rekursive Funktion,
			wie oft der Frosch springen muss um 1,99 Meter zu erreichen.

			Zusatz2:
			Wie weit muss der Frosch beim ersten Mal mindestens springen,
			um die 2,5 Meter zu schaffen?
        */
         // Teil 1: Prüfen, ob der Frosch 2,5 Meter schafft
         double totalDistance = calculateTotalDistance(1.0, 2.5);
         System.out.printf("Gesamte Distanz: %.2f Meter%n", totalDistance);
 
         // Teil 2: Anzahl der Sprünge, um 1,99 Meter zu erreichen
         int jumpsToReach199 = calculateJumpsToTarget(1.0, 1.99);
         System.out.printf("Anzahl der Sprünge, um 1,99 Meter zu erreichen: %d%n", jumpsToReach199);
 
         // Teil 3: Minimaler erster Sprung, um 2,5 Meter zu schaffen
         double minFirstJump = calculateMinFirstJump(2.5);
         System.out.printf("Minimaler erster Sprung für 2,5 Meter: %.2f Meter%n", minFirstJump);

    }

    public static double calculateTotalDistance(double firstJump, double target) {
        double distance = 0.0;
        double currentJump = firstJump;

        while (distance < target && currentJump > 0) {
            distance += currentJump;
            currentJump /= 2;
        }
        return distance;
    }

    public static int calculateJumpsToTarget(double firstJump, double target) {
        return calculateJumpsRecursive(firstJump, target, 0, 0.0);
    }

    private static int calculateJumpsRecursive(double jump, double target, int jumps, double total) {
        if (total >= target) {
            return jumps;
        }
        return calculateJumpsRecursive(jump / 2, target, jumps + 1, total + jump);
    }

    public static double calculateMinFirstJump(double target) {
        double left = 0.01; // Minimalwert
        double right = target; // Maximalwert
        double epsilon = 0.0001; // Genauigkeit

        while (right - left > epsilon) {
            double mid = (left + right) / 2;
            if (calculateTotalDistance(mid, target) >= target) {
                right = mid; // Verkürze die obere Schranke
            } else {
                left = mid; // Erhöhe die untere Schranke
            }
        }
        return (left + right) / 2;
    }


}
