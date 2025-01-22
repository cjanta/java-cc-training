package bonusaufgaben;


public class _290_Passwortqualitaet {

    public static void main(String[] args) {

        /* Passwortqualität
         *
         * Schreibe eine Methode, die die Qualität von Passwörtern nach
         * einem einfachen Punktesystem bewertet.
         * Es gelten dabei die folgenden
         * Regeln:
         * – Passwort mit 7 oder weniger Zeichen: immer 0 Punkte,
         * - egal, welche Kriterien noch erfüllt sind.
         * – Ab 8 Zeichen: 1 Punkt
         * 
         * – Enthält sowohl Groß- als auch Kleinbuchstaben: +1 Punkt
         * 
         * – Enthält mehr als sechs unterschiedliche Zeichen: +1 Punkt
         * 
         * – Enthält zumindest eine Ziffer: +1 Punkt
         * – Enthält zumindest ein Sonderzeichen: +1 Punkt
         * Beispiele:
         * – 'abc': 0 Punkte
         * – 'abcdefghij': 2 Punkte
         * – 'ab1122$$!!': 3 Punkte
         * – 'Abcd1234$!': 5 Punkte
         */
        System.out.println("  ");
        System.out.println("Punkte: " + countPasswordQuality("abc"));
        System.out.println("Punkte: " + countPasswordQuality("abcdefghij"));
        System.out.println("Punkte: " + countPasswordQuality("ab1122$$!!"));
        System.out.println("Punkte: " + countPasswordQuality("Abcd1234$!"));
    }

    private static int countPasswordQuality(String pass){
        return checkLength(pass) == 0 ? 0 : checkLength(pass) +
                                            checkSpecialCharacter(pass) +
                                            checkDigit(pass) +
                                            checkRainbow(pass) +
                                            checkUpperAndLowerCase(pass); 
    }

    private static int checkSpecialCharacter(String pass){
        return pass.matches(".*[^a-zA-Z0-9 ].*") ? 1 : 0;
    }

    private static int checkDigit(String pass){
        for (char character : pass.toCharArray()) {
            if(Character.isDigit(character)){
                return 1;
            }        
        }
        return 0;
    }

    private static int checkRainbow(String pass){
       return pass.chars().distinct().count() >= 6 ? 1 : 0;
    }

    private static int checkLength(String pass){
        int length = pass.length();
        if(length <= 7){
            return 0;
        }
        return 1;
    }

    private static int checkUpperAndLowerCase(String pass){
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        for (char character : pass.toCharArray()) {
            if(Character.isUpperCase(character)){
                hasUpperCase = true;
            }
            if (Character.isLowerCase(character)){
                hasLowerCase = true;
            }
            if(hasUpperCase && hasLowerCase){
                return 1;
            }
        }
        return 0;
    }
}
