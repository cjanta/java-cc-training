package _1000_1090;

public class _1030_AssertionError {
    public static void main(String[] args) {

        // AssertionError extends Error

        try {
            throw new AssertionError("Catch me!");
        } catch (Exception ex) {
            System.out.println("Exception");
        } catch (Error err) {
            System.out.println("Error");  // Error
        } catch (Throwable t) {
            System.out.println("Throwable");
        }
    }
}
