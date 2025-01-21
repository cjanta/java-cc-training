package _900_990;

public class _940_Boolean {

    public static void main(String[] args) {

        // Boolean.TRUE, Boolean.FALSE
        System.out.println(Boolean.TRUE);   // true
        System.out.println(Boolean.FALSE);  // false

        // Boolean(String str)
        Boolean boo = new Boolean("true");
        System.out.println(boo);                      // true
        System.out.println(new Boolean("Hello"));  // false
        System.out.println(new Boolean("TRUE"));   // true

        // Boolean(boolean b)
        // It also works with a Boolean object (unboxing)
        System.out.println(new Boolean(true));   // true
        Boolean boo2 = new Boolean("false");
        Boolean boo3 = new Boolean(boo2);
        System.out.println(boo3);                      // false

        // boolean Boolean.parseBoolean(String str)
        // Gibt es nur mit einem String
        // Returniert einen primitiven boolean
        System.out.println(Boolean.parseBoolean("TRUE"));  // true

        // Boolean.valueOf() geht mit String oder Boolean
        System.out.println(Boolean.valueOf(false));    // false
        System.out.println(Boolean.valueOf("false"));  // false
    }
}
