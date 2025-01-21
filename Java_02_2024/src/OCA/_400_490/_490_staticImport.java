package _400_490;

// static import

import static java.lang.Math.*;      // <package>.<classname>.*;
import static java.lang.System.out;  // <package>.<classname>.<fieldname>;

import static java.lang.Integer.*;
import static java.lang.Long.*;

public class _490_staticImport {

    public static void main(String[] args) {

        out.println(PI);           // 3.141592653589793
        out.println(round(4.49));  // 4
        out.println(random());     // z.B. 0.3428734577920499

        // out.println(MAX_VALUE);  // 2147483647
        // reference to MAX_VALUE is ambiguous

    }
}

// Normale imports:
// <package>.<classname>;
// <package>.*;