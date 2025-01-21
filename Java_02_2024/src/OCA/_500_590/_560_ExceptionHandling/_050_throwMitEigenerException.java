package _500_590._560_ExceptionHandling;

class LeereEingabeException extends NumberFormatException {

    public LeereEingabeException() {
        super();
    }

    public LeereEingabeException(String str) {
        super(str);
    }

}

public class _050_throwMitEigenerException {

    // throw mit eigener Exception

    public static void main(String[] args) {

        String hoehe = "";

        try {

            int x = Integer.parseInt("4.7");

            if (hoehe.equals("")) {
                throw new LeereEingabeException("Bitte die Höhe eingeben!");
            }

        } catch (LeereEingabeException e) {
            System.out.println("LeereEingabeException");
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            System.out.println(e.getMessage());
        }


    }
}
