package bonusaufgaben;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _050_ZeichenanzahlInString {

    public static void main(String[] args) {

        /*
         * Zeichenanzahl in String
         *
         * Schreibe eine Methode, die einen String entgegen nimmt
         * und die Anzahl der einzelnen Zeichen in Form einer HashMap zurück gibt.
         *
         * Z.B. 'Hello World' wird zu:
         * { =1, r=1, d=1, e=1, W=1, H=1, l=3, o=2}
         */

        // Möglicher Zusatz:
        // Keine Sonderzeichen, toLowerCase()
        System.out.println(countCharacters("Hello World"));

    }

    private static Map<String,Long> countCharacters(String str){
        return Stream.of(str.split(""))
                .map(substr -> new String(substr))
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

   
}
