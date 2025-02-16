package _300_390;

public class _310_StringBuilder {

    public static void main(String[] args) {

        // StringBuilder
        // Veränderbar (im Gegensatz zum String)
        // Es entsteht ein Objekt, das immer wieder verändert wird

        StringBuilder sb1 = new StringBuilder("Hello");

        // append() - anhängen
        sb1.append(" ");
        sb1.append("World");
        System.out.println(sb1);                             // Hello World
        System.out.println(sb1.getClass());                  // class java.lang.StringBuilder
        System.out.println(sb1.getClass().getSimpleName());  // StringBuilder

        // Hier werden insgesamt drei Strings erzeugt:
        String s = "Hello";
        s += " ";
        s += "World";
        System.out.println(s);

        // Chaining
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello").append(" ").append("World");
        System.out.println(sb2);
        // Concatination
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Hello" + " " + "World");
        System.out.println(sb3);

        // Vergleiche

        // System.out.println(sb2 == s);  // incomparable types: java.lang.StringBuilder and java.lang.String
        System.out.println(sb2 == sb3);       // false, da es verschiedene Objekte sind
        System.out.println(sb2.equals(sb3));  // false, da es verschiedene Objekte sind
        System.out.println(sb2.equals(s));    // false, da es sogar auch verschiedene Klassen sind

        String s3 = sb3.toString();
        System.out.println(s3.getClass());  // class java.lang.String

        // Um StringBuilder-Objekte zu vergleichen, muss man sie erst zum String machen
        System.out.println(sb2.toString().equals(sb3.toString()));  // true

        // insert(offset, string)
        StringBuilder sb4 = new StringBuilder("abcdefg");
        sb4.insert(0, "123");
        System.out.println(sb4);  // 123abcdefg
        sb4.insert(7, "---");
        System.out.println(sb4);  // 123abcd---efg

        // delete(start, end)
        // Den Inhalt komplett löschen:
        sb4.delete(0, sb4.length());
        System.out.println(sb4);

        // setCharAt()
        // Destruktiv
        StringBuilder sb5 = new StringBuilder("Hello");
        sb5.setCharAt(1, 'a');
        System.out.println(sb5);  // Hallo

        // NICHT destruktiv
        String str1 = "Hello";
        String str2 = "World";
        str1.concat(str2);
        System.out.println(str1);  // Hello
        str1 = str1.concat(str2);
        System.out.println(str1);  // HelloWorld

        // capacity()
        StringBuilder sb = new StringBuilder();

        // Mal zwei plus zwei

        // Am Anfang leer
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": " + sb.capacity());  // // 16 -> 34 -> 70 -> 142 -> ...
            sb.append("!");
        }

        // Am Amfang voll
        StringBuilder sbu = new StringBuilder("nullnull");
        for (int i = 0; i < 100; i++) {
            System.out.println(i + ": " + sbu.capacity());  // 24 -> 50 -> 102 -> 206 -> ...
            sbu.append("!");
        }

        // append() mit mehreren Parametern
        // append(Charsequence, start, end)
        // start ist inklusive und end ist exklusive
        StringBuilder sb6 = new StringBuilder("Hello");
        String ziffern = "0123456789";
        sb6.append(ziffern, 3, 8);
        System.out.println(sb6);  // Hello34567

        // trimToSize()
        StringBuilder sb7 = new StringBuilder("abcd");
        System.out.println(sb7.capacity());  // 20
        sb7.delete(0, sb7.length());
        System.out.println(sb7.capacity());  // 20
        sb7.trimToSize();
        System.out.println(sb7.capacity());  // 0

        // ensureCapacity()
        StringBuilder sb8 = new StringBuilder();
        sb8.ensureCapacity(1000);
        System.out.println(sb8.capacity());  // 1000

        // String substring(start, end)
        StringBuilder sb9 = new StringBuilder("Hello World!");
        String str9 = sb9.substring(6, 11);
        System.out.println(str9);  // World

        // setLength(newLength)
        // Beim Verlängern werden null character '\u0000' eingefügt.
        StringBuilder sb10 = new StringBuilder("Hello World!");
        sb10.setLength(4);
        System.out.println(sb10);  // Hell
        sb10.setLength(20);
        System.out.println(sb10 + "Woo");   // Hell                Woo
        System.out.println(sb10.length());  // 20

        // replace(start, end, newString)
        StringBuilder sb11 = new StringBuilder("Hello World!");
        sb11.replace(6, 11, "Welt");
        System.out.println(sb11);  // Hello Welt!


        // StringBuilder und String konkatenieren
        String str3 = new StringBuilder("Hello") + " World";
        System.out.println(str3);  // Hello World


        // Trimmen get nur über String
        StringBuilder sb12 = new StringBuilder("  Hello World!  ");
        System.out.println("---" + sb12.toString().trim() + "---");  // ---Hello World!---

        // insert() mit mehreren Parametern
        // insert(int dstOffset, CharSequence s, int start, int end)
        StringBuilder sb13 = new StringBuilder("Hello World!");
        sb13.insert(5, "Brave new world", 5, 9);
        System.out.println(sb13);  // Hello new World!


    }
}
