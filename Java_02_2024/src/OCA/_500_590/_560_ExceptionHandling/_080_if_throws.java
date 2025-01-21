package _500_590._560_ExceptionHandling;

public class _080_if_throws {

    public static void main(String[] args) throws Exception {
        // public static void main(String[] args){

        // Auch bei einem throw im if braucht die Methode ein throws
        if (false) {
            throw new Exception();
        }
    }
}
