package _100_190;

public class _140_BreakContinue {

    public static void main(String[] args) {

        // break
        // Kann in Schleifen oder im switch auftauchen
        // Beendet die Schleife komplett
        for (int i = 1; i < 10; i++) {
            if (i == 7) {
                break;
            }
            System.out.print(i + " ");  // 1 2 3 4 5 6
        }
        System.out.println();

        // continue
        // Kann nur in Schleifen auftauchen
        // Beendet den aktuellen Schleifendurchlauf vorzeitig
        // und führt die Schleife fort
        for (int i = 1; i < 10; i++) {
            // System.out.println("Hello");
            if (i == 7) {
                continue;
            }
            System.out.print(i + " ");  // 1 2 3 4 5 6 8 9
        }
        System.out.println();
    }
}
