package _010_080.Aufgaben;

public class _020_Fakultaet {

    public static void main(String[] args) {

        /*
         * Fakultät
         *
         * Schreibe ein Programm,
         * das ermittelt, welche Zahl möglichst groß ist
         * ohne dass ihre Fakultät über 1.000.000.000 ist.
         *
         * Gib zum Beweiß auch alle kleineren Fakultäten aus.
         *
         * Hinweis:
         * Fakultät von 5 (Kurzschreibweise: 5!):
         * 1 * 2 * 3 * 4 * 5 = 120
         */

         int milliarde = 1000000000;
         int input = 0;
         long fac =0;
         while(fac <= milliarde){
            input +=1;
            fac = faculty(input);
            if (fac <= milliarde){
                System.out.println("Fakultät von: " + input + " beträgt: " + fac);
            }
            else{
                System.out.println("Fakultät von: " + input + " beträgt: " + fac + " und liegt über dem Schwellenwert von: " + milliarde);
            }
         }

    }


    private static long faculty(int value){
        if (value < 1){
            throw new UnsupportedOperationException();
        }
        int fac = 1;
        int i =1;
        while (i <= value) {
            fac = fac * i;
            i++;
        }
        return fac;
        
    }
}
