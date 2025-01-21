package _500_590._560_ExceptionHandling;

public class _030_finally {

    // finally
    // Wird in jedem Fall ausgeführt.
    // Für Sachen, die logisch/inhaltlich zum Thema aus dem try gehören
    // Compiliert auch ohne catch

    public static void main(String[] args) {

        try {

            "Hello".charAt(10);  // StringIndexOutOfBoundsException: String index out of range: 10

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
            System.out.println(e.getMessage());  // String index out of range: 10
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e);
        } finally {
            System.out.println("finally wird in jedem Fall ausgeführt!");
            System.out.println("Hier alles rein, was zum Thema aus dem try-Block gehört.");
        }

        System.out.println("Nächstes Thema!");


    }
}
