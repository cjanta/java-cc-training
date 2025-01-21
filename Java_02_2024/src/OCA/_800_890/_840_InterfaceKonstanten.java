package _800_890;

// Variablen/Konstanten im Interface sind automatisch public static final
// Sie müssen direkt initialisiert werden.

interface Test {
    int x = 3;
    public static final int y = 11;
}

public class _840_InterfaceKonstanten {

    public static void main(String[] args) {

        System.out.println(Test.x);  // 3
        System.out.println(Test.y);  // 11

    }
}
