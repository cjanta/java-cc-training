package _800_890;

public class _880_KonstantenOhneCasting {

    // Konstanten gehen ohne Casting, wenn der Wert passt.
    // Die Prüfung findet zur Compile-Zeit statt.
    // Bei Variablen könnte sich zur Runtime der Wert ändern.
    // Deswegen weigert sich der Compiler.

    public static void main(String[] args) {

        short s1 = Short.MAX_VALUE;
        System.out.println(s1);  // 32767
        // char c1 = s1;  // java: incompatible types: possible lossy conversion from short to char

        final short s2 = Short.MAX_VALUE;
        char c2 = s2;
        System.out.println(c2);  // 翿

        short s3 = 1;
        // byte b3 = s3;  // java: incompatible types: possible lossy conversion from short to byte

        final short s4 = 1;
        byte b4 = s4;
        System.out.println(b4);  // 1

        final short s5 = 200;
        // byte b5 = s5;  // java: incompatible types: possible lossy conversion from short to byte

    }
}
