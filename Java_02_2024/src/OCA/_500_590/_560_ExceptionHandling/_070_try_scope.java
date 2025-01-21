package _500_590._560_ExceptionHandling;

public class _070_try_scope {

    public static void main(String[] args) {

        int y = 11;

        try {
            System.out.println(y);  // 11
            int x = 7;
            System.out.println(x / 0);
        } catch (Exception e) {
            System.out.println(y);  // 11
            // System.out.println(x);  // cannot find variable x
            int z = 23;
        } finally {
            System.out.println(y);  // 11
            // System.out.println(z);  // cannot find variable z
            // System.out.println(x);  // cannot find variable x
            int w = 42;
        }
        System.out.println(y);  // 11
        // System.out.println(w);  // cannot find variable w
        // System.out.println(z);  // cannot find variable z
        // System.out.println(x);  // cannot find variable x

    }
}
