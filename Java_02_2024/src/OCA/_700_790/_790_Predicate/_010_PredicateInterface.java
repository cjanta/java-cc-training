package _700_790._790_Predicate;

import java.util.function.Predicate;

public class _010_PredicateInterface {

    // Predicate
    // Interface, das von Java zur Verfügung gestellt wird.
    // Ist ein Funktionales Interface, was bedeutet, dass es nur eine abstracte Methode hat.
    // test() übernimmt einen Wert und liefert true oder false zurück.
    // Predicate ist parametrisiert: Predicate<T>
    // T muss ein Objekt sein (kein primitiver Datentyp)

    public static void main(String[] args) {

        Predicate<Integer> negativeZahlen1 = i -> i < 0;

        System.out.println(negativeZahlen1.test(-2));  // true

        // Die runden Klammern um den Parameter dürfen wegfallen, wenn es genau ein Parameter ist.
        Predicate<Integer> negativeZahlen2 = (i) -> i < 0;

        // Bei geschweiften Klammer braucht man auch das return und das Semikolon
        Predicate<Integer> negativeZahlen3 = (i) -> {
            return i < 0;
        };
        Predicate<Integer> negativeZahlen4 = (i) -> {
            int x = 0;
            boolean res = false;
            if (i < x) res = true;
            return res;
        };

        // Der Datentyp des Parameters kann auch angegeben werden
        Predicate<Integer> negativeZahlen5 = (Integer i) -> i < 0;

        // Eigene Funktionen, die ein Prdicate als Parameter übernehmen
        System.out.println(checkInt(6, i -> i % 2 == 0));  // true
        System.out.println(checkInt(9, i -> i % 2 == 0));  // false

        System.out.println(checkStr("Hello", s -> s.startsWith("H")));  // true

        System.out.println(check(6, i -> i % 2 == 0));  // true
        System.out.println(check(9, i -> i % 2 == 0));  // false

        System.out.println(check("Hello", s -> s.startsWith("H")));  // true
    }

    static boolean checkInt(Integer i, Predicate<Integer> pre) {
        return pre.test(i);
    }

    static boolean checkStr(String i, Predicate<String> pre) {
        return pre.test(i);
    }

    static <T> boolean check(T t, Predicate<T> pre) {
        return pre.test(t);
    }


}
