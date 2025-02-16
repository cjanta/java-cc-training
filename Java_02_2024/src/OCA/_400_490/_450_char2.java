package _400_490;

public class _450_char2 {

    public static void main(String[] args) {

        // Zeilenumbruch (line feed) als Zeichen geht nicht per Unicode:
        char newline = 0;
        /* newline = '\u000a';  */ // illegal line end in character literal
        System.out.println(newline);  //  
        System.out.println('\n');

        char backspace = '\u0008';
        char tab = '\u0009';
        char formFeed = '\u000c';
        /* char carrigeReturn = '\u000d'; */
        char doubleQuote = '\u0022';
        // char singleQuote = '\u0027';  // empty character literal
        // char backslash = '\u005c';  // unclosed character literal

        // Octal representation
        char nl = '\12';
        System.out.println("Hello" + nl + "World");
        // Hello
        // World
        System.out.println('\101');  // A
        // Größmögliche Wert 0377 (entspricht 255)
        System.out.println('\377');  // ÿ
        // System.out.println('\400');  // unclosed character literal
        char gross = 255;
        System.out.println(gross);  // ÿ

        // Non ASCII-Character als Identifier
        char chi = '\u559c';
        System.out.println(chi);  // 喜

        char 喜 = 65;
        System.out.println(喜);  // A

        // Mag IntelliJ nicht, aber der Compiler es:
        /*
        char \u559d = 'Z';
        System.out.println(\u559d);  // Z
        char \u0043 = '\u0043';
        System.out.println(\u0043);  // C
        System.out.println(C);       // C
        */


    }
}
