package _900_990;

public class _950_thisNeverStatic {

    // this geht NIE im statischen Kontext

    int x = 23;
    static int y = 42;

    public static void main(String[] args) {

        // System.out.println(this.x);
        // java: non-static variable this cannot be referenced from a static context
        // System.out.println(this.y);
        // java: non-static variable this cannot be referenced from a static context

        // Via Objekt-Referenz geht es natürlich
        _950_thisNeverStatic obj = new _950_thisNeverStatic();
        System.out.println(obj.y);  // 42
    }
}
