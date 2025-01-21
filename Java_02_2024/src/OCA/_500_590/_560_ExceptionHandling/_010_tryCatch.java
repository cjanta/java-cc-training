package _500_590._560_ExceptionHandling;

public class _010_tryCatch {

    // try catch
    // Der Code im try-Block wird ausgeführt.
    // Wenn dabei eine Exception entsteht,
    // wird nicht wie sonst die Ausführung des Programms beendet,
    // sondern der catch-Block wird ausgeführt.

    public static void main(String[] args) {

        try {
            System.out.println(1 / 0);  // ArithmeticException: / by zero
            // System.out.println(1 / 1);
            System.out.println("Wenn vor mir eine Exception war, werde ich nicht ausgeführt.");

        } catch (Exception e) {
            // e ist hier frei wählbar
            System.out.println(e);  // java.lang.ArithmeticException: / by zero
            System.out.println(e.getMessage());  // / by zero
            e.printStackTrace();
        }

        // System.out.println(1 / 0);

        System.out.println("Hello");  // Hello
    }
}
