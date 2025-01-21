package _500_590._560_ExceptionHandling;

public class _020_MehrereCatch {

    // Mehrere catch
    // Es wird immer nur höchstens ein catch-Block ausgeführt.
    // Sobald ein catch-Block zutrifft, wird dieser ausgeführt
    // Die spezialisierteren Klassen müssen zuerst stehen.

    public static void main(String[] args) {

        try {
            // System.out.println(1 / 0);  // ArithmeticException: / by zero
            int x = Integer.parseInt("4.7");  // NumberFormatException: For input string: "4.7"
            // String s = null; System.out.println(s.length());  // NullPointerException
            // int[] x = {1}; System.out.println(x[1]);  // java.lang.ArrayIndexOutOfBoundsException: 1
            // "Hello".charAt(10);  // StringIndexOutOfBoundsException: String index out of range: 10

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
            System.out.println(e.getMessage());  // / by zero
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            System.out.println(e.getMessage());  // For input string: "4.7"
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
            System.out.println(e.getMessage());  // null
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e.getMessage());  // 1
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
            System.out.println(e.getMessage());  // String index out of range: 10
        } catch (Exception e) {
            System.out.println("Exception");
            System.out.println(e);
        }


    }
}
