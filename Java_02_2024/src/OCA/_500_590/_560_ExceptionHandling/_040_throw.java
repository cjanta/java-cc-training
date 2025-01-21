package _500_590._560_ExceptionHandling;

public class _040_throw {

    // throw
    // Zum zum selber Exceptions werfen.

    public static void main(String[] args) {

        String hoehe = "";
        String breite = "200";

        try {

            // int x = Integer.parseInt("4.7");

            if (hoehe.equals("")) {
                throw new NumberFormatException("Bitte die Höhe eingeben!");
            }

            if (breite.equals("")) {
                throw new NumberFormatException("Bitte die Breite eingeben!");
            }

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }


    }
}
